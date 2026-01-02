import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String []args){
        int numbOfGrades= 0, option;
        boolean isInt= true, isDouble=true;
        double grades=0, average=0;
        double [] arrayGrades;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator");
        do{
            do{
                System.out.println("Enter the number of grades you want to calculate");
                if(input.hasNextInt()){
                    numbOfGrades = input.nextInt();
                    arrayGrades = arrayGrades(numbOfGrades, input);
                    average= calculateAverage(arrayGrades);
                    System.out.println("You have entered " + arrayGrades.length + " grades");
                    System.out.println("The average is " + average );
                    isInt = true;
                }
                else{
                    System.out.println("Please enter a valid input ...");
                    input.next();
                    isInt =false;
                }
            }while(isInt == false);

            do{
                System.out.println("Do you want to calculate another average:(option 1 or 2)" );
                System.out.println("1. Yes");
                System.out.println("2. No");
                option = input.nextInt();
            }while(option != 1 && option!=2 );

        }while(option == 1);

    }

    public static double [] arrayGrades(int numbOfGrades, Scanner input){
        double [] arrayGrades = new double[numbOfGrades];
        double grades;
        boolean isDouble = true;

        for(int i=0 ; i<numbOfGrades ; i++){
            do{
                System.out.println("Enter grade number "+ (i+1));
                if(input.hasNextDouble()){
                    grades = input.nextDouble();
                    arrayGrades[i] = grades;
                    isDouble = true;
                }
                else{
                    System.out.println("Please enter a valid input ...");
                    input.next();//consumes the invaid input
                    isDouble = false;
                }
            }while(isDouble == false);
        }

        return arrayGrades;
    }

    public static double calculateAverage(double [] arrayGrades){
        double total =0,average =0;

        for(int i=0; i< arrayGrades.length ; i++){
            total+=arrayGrades[i];
        }

        return total/arrayGrades.length;
    }

}