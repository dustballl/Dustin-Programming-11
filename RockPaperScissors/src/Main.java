import java.util.Random;
import java.util.Scanner;

// This program will play rock, paper, scissors with you. Simply follow the instructions printed to the console.

public class Main {
    public static void main(String[] args) {

        // State variables
        char computerChoice; // Will show the computer's selection
        char playerChoice; // Will show player's selection
        String playerInput; // Contains the player's input
        char validSelections[] = {'r', 'p', 's'}; // The three valid choices
        // Make a scanner
        Scanner scan = new Scanner(System.in);
        //Make a random object
        Random rand = new Random();

        // Game starts
        // Display rules of the game
        System.out.println();
        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper, and 's' for scissors.");
        // Get player input
        playerInput = scan.nextLine();
        scan.close();
        // Check if player choice is valid
        if ((playerInput.length() !=1) || (!(new String(validSelections).contains(playerInput)))){
            System.out.println("Invalid selection please play again.");
        }
        playerChoice = playerInput.charAt(0);
        // Computer randomly selects choice
        computerChoice = validSelections[rand.nextInt(3)];

        // Determine whether the player wins, loses, or draws
        if (playerChoice == ('r')){
            if (computerChoice == ('r')){
                System.out.println("Draw!");
                System.out.print("Computer choice: rock");
            } else if (computerChoice == ('s')){
                System.out.println("You Win!");
                System.out.print("Computer choice: scissors");
            } else if (computerChoice == ('p')){
                System.out.println("You Lose!");
                System.out.print("Computer choice: paper");
            }
            System.out.println("\tPlayer choice: rock");
        }if (playerChoice == ('s')){
            if (computerChoice == ('s')){
                System.out.println("Draw!");
                System.out.print("Computer choice: scissors");
            } else if (computerChoice == ('p')){
                System.out.println("You Win!");
                System.out.print("Computer choice: paper");
            } else if (computerChoice == ('r')){
                System.out.println("You Lose!");
                System.out.print("Computer choice: rock");
            }
            System.out.println("\tPlayer choice: scissors");
        }if (playerChoice == ('p')){
            if (computerChoice == ('p')){
                System.out.println("Draw!");
                System.out.print("Computer choice: paper");
            } else if (computerChoice == ('r')){
                System.out.println("You Win!");
                System.out.print("Computer choice: rock");
            } else if (computerChoice == ('s')){
                System.out.println("You Lose!");
                System.out.print("Computer choice: scissors");
            }
            System.out.println("\tPlayer choice: paper");
        }
    }
}