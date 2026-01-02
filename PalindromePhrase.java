import java.util.Scanner;

public class PalindromePhrase
{
    public static void main(String []args){
        String wordPhrase, reversed;
        int option;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker");
        do{
            System.out.println("Please enter the word or phrase: ");
            wordPhrase=input.nextLine().trim();

            if(wordPhrase.contains(" ")){
                System.out.println("You have entered a phrase");
                System.out.println(reversePhrase(wordPhrase));
            }
            else{
                System.out.println("You have entered a word");
                System.out.println(reverseWord(wordPhrase));
            }


            System.out.println("\n\nDo you want enter another word: (Option 1 or 2) ");
            System.out.println("1. Yes ");
            System.out.println("2. No ");
            option = input.nextInt();
            input.nextLine();

        }while(option == 1);
    }

    public static String reversePhrase(String word){
        String [] splitPhrase = word.split(" ");
        String oneWord= "", reverse = "";
        for(int i=0 ; i<splitPhrase.length ; i++){
            oneWord += splitPhrase[i].toString();
        }

        String [] oneword = oneWord.split("");
        for(int i=oneword.length-1  ; i>=0 ; i--){
            reverse += oneword[i];
        }

        if(oneWord.equalsIgnoreCase(reverse)){
            return "This is a palindrome\n"+  "input: " + oneWord + " reversed: " + reverse;
        }
        else{
            return "This is not a palindrome\n"+ "input: " + oneWord + " reversed: " + reverse;
        }

    }

    public static String reverseWord(String word){
        String [] splitWord= word.split("");
        String reverse = "";

        for(int i=splitWord.length-1  ; i>=0 ; i--){
            reverse += splitWord[i];
        }

        if(word.equalsIgnoreCase(reverse)){
            return "This is a palindrome\n"+  "input: " + word + " reversed: " + reverse;
        }
        else{
            return "This is not a palindrome\n"+ "input: " + word + " reversed: " + reverse;
        }
        
    }

}