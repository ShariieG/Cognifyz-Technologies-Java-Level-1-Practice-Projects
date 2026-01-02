import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator
{
    public static void main(String [] args){
        int passLength, optionPass,counter=0, arrayOptPass [] = new int[5], repeat;
        String password, passFormat = "";
        String capAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smalAlpha = "abcdefghijklmnopqrstuvwxzy";
        String numbers= "0123456789";
        String specChar= "¬`£$%^&*~#@'";

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter the desired length of the password:");
            passLength= input.nextInt();

            do{
                System.out.println("What should your password consist of: (option 1,2,3,4) or 55 to exit");
                System.out.println("1.Uppercase Alphabets");
                System.out.println("2.lowercase Alphabets");
                System.out.println("3.Numbers ");
                System.out.println("4.Special Characters");
                optionPass= input.nextInt();

                if(optionPass ==1){
                    System.out.println("Uppercase Alphabets Selected");
                    passFormat += capAlpha;
                }
                else if(optionPass ==2){
                    System.out.println("lowercase Alphabets Selected");
                    passFormat += smalAlpha;
                }
                else if(optionPass ==3){
                    System.out.println("Numbers Selected ");
                    passFormat += numbers;
                }
                else if (optionPass ==4){
                    System.out.println("Special Character Selected ");
                    passFormat += specChar;
                }
                else{
                    System.out.println("55 Selected ");
                    passFormat+="";
                    break;
                }
            }while(optionPass!= 55 );

            password = passwordGenerator(passLength,passFormat);
            System.out.println("Our generated password is: " + password);
            
            System.out.println("Do you want to generate another password: (option 1,2)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            repeat = input.nextInt();
        }while(repeat == 1);
    }

    public static String passwordGenerator(int passLength,String passFormat){
        Random rand = new Random();
        int length = passFormat.length();
        String password = "";

        for(int i=0; i<passLength ; i++){
            int randNumb = rand.nextInt(length);
            char alpha = passFormat.charAt(randNumb);
            password += alpha;
        }

        return password;
    }
}