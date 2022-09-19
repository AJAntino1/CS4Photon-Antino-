package ex02;
import java.util.Scanner;

public class Ex02PhotonAntino {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        int first = 1;
        int second = 10;
        int third = 5;
        int playerGuess = 0;
        
            
            do {
                System.out.println("Welcome to Higher or Lower! What will you do?\n"+
                "-Start game\n" +
                "-Change settings\n" +
                "-End application\n");
                userInput = scan.nextLine();
            int min = first;
            int range = second;
            int guesses = third;
            switch (userInput) {

                case "Start game":
                        String response;
                        do {
                        response = "";
                        min = first;
                        range = second;
                        guesses = third;
                        int random = (int) Math.floor(Math.random()*range) + min;
                        System.out.println("The number is between " + min + " to " + range);
                        System.out.println("Please only input integer values!");
                        System.out.print("You have " + guesses + " guess(es) left. What is your guess? ");
                        while (playerGuess != random) {
                        playerGuess = scan.nextInt();
                        guesses--;
                        if (playerGuess > random) {
                            System.out.print("Guess lower! You have " + guesses + " guess(es) left. What is your guess? " );
                        }
                        else if (playerGuess < random) {
                            System.out.print("Guess higher! You have " + guesses + " guess(es) left. What is your guess? ");
                        }
                        
                        else {
                            System.out.println("You got it!");

                        } 
                        
                        if (guesses == 0){
                            System.out.println("\nYou lost...");
                            break;
                        } 
                        }
                        System.out.print("Play again(y/n)? ");
                        while (response.equalsIgnoreCase("")){
                            response = scan.nextLine();
                        }

                } while (response.equalsIgnoreCase("y"));
                            
                    break;

                case "Change settings":
                    System.out.println("What is the lower limit of the random number? " + min);
                    System.out.println("What is the upper limit of the random number? " + range);
                    System.out.println("How many guesses are allowed?" + guesses);
                    System.out.print("Lower limit: ");
                    first = scan.nextInt();
                    System.out.print("Higher limit: ");
                    second = scan.nextInt();
                    System.out.print("Guesses: ");
                    third = scan.nextInt();
                    System.out.println("\n");
                    break;
                    
                case "End application":
                    System.out.println("Thank you for playing!");
                    break;
                
                default:
                    break;
            }
            } while (!userInput.equalsIgnoreCase("End application"));
    }
    
}
