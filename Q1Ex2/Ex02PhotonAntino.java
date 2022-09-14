package javaapplication4;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex02PhotonAntino {
    public static void main(String[] args) {
        
        String s1 = "Start game";
        String s2 = "Change settings";
        String s3 = "End Application";
        
        System.out.println("Welcome to Higher or Lower! What will you do?\n");
        System.out.printf("-" + "%s\n", s1);
        System.out.printf("-" + "%s\n", s2);
        System.out.printf("-" + "%s\n", s3);
        
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        
        int range = 10;
        int min = 1;
        int guessCount = 5;
        
        if (userInput.equalsIgnoreCase("start game")) {
        int randomNumber =  (int) Math.floor(Math.random()*range) + min;
        System.out.println(randomNumber);
        
        while(true) {
        System.out.println("Enter your guess (1-10): ");
        Scanner scanner = new Scanner(System.in);
 
        int playerGuess = scanner.nextInt();
        guessCount--;
        if(guessCount == 0) {
            System.out.println("You lost...");
            break;
        }
        
        if(playerGuess == randomNumber) {
            System.out.println("You got it!");
            break;
        }
        else if(playerGuess > randomNumber) {
            System.out.println("Guess Lower! " + "You have " + guessCount + " guess(es) left. What is your guess?");
        }
        else
            System.out.println("Guess Higher! " + "You have " + guessCount + " guess(es) left. What is your guess?");
        }
    } else if (userInput.equalsIgnoreCase("change settings")) {
        System.out.println("What is the lower limit of the random number?");
        System.out.println("What is the upper limit of the random number?");
        System.out.println("How many guesses are allowed?");
        System.out.println("Lower limit: ");
        int lowerLimit = sc.nextInt();
        min = lowerLimit;
        
        System.out.println("Higher limit: ");
        int higherLimit = sc.nextInt();
        range = higherLimit; 
        
        System.out.println("Guesses: ");
        int guesses = sc.nextInt();
        guessCount = guesses;
        
    } else if (userInput.equalsIgnoreCase("End Application")) {
        System.out.println("Thank you for playing!");
    } else
        System.out.println("Invalid Input! Please try again");
}
    
}
