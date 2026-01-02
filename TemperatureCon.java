
import java.util.Scanner;
import java.util.InputMismatchException;

public class TemperatureCon
{
    public static void main(String [] args){
        int unitOpt, repeatOpt;
        String temp;
        boolean isValid =true;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to a Temperature Converter");

        do{
            do{
                System.out.println("Enter the unit measurement: (Option 1 or 2)");
                System.out.println("1. Celsius ");
                System.out.println("2. Fahrenheit");
                unitOpt = input.nextInt();

                if(unitOpt != 1 && unitOpt != 2){
                    System.out.println("Incorrect option. Enter either 1 or 2 ... ");
                }
            }
            while(unitOpt != 1 && unitOpt != 2);

            //temp is received as String the valuated if it is a double
            do{
                System.out.println("Please enter a temperature: "); //if it is not a double the system will crush
                temp = input.next();
                isValid=isDouble(temp,unitOpt);
            }while(isValid== false);


            do{
                System.out.println("Do you want to do another temperature convertion: ( option 1 0r 2) ");
                System.out.println("1. Yes");
                System.out.println("2. No");
                repeatOpt = input.nextInt();
            }while(repeatOpt!= 1 && repeatOpt!= 2);
        }
        while(repeatOpt == 1);
    }

    public static boolean isDouble(String temps, int unitOpt){
        double convTemp;
        try{
            Double temp = Double.parseDouble(temps);
            if(unitOpt == 1){
                convTemp = (temp * 9/5) + 32;
                System.out.println("Your converted tempature is "+ convTemp + " Fahrenheit");
            }
            else{
                convTemp = (temp - 32) * 5/9;
                System.out.println("Your converted tempature is "+ convTemp + " Degree Celsius");
            }
            return true;
        }catch(Exception exception){
            System.out.println("Numeric value is required.");
            return false;
        }

    }

}