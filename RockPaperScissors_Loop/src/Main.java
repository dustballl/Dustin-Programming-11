import java.util.Random;
import java.util.Scanner;

// This program will play rock, paper, scissors with you. Simply follow the instructions printed to the console.

public class Main {
    public static void main(String[] args) {

        // State variables
        char computerChoice; // Will show the computer's selection
        char playerChoice; // Will show player's selection
        String playerInput; // Contains the player's input
        int wins = 0;
        int losses = 0;
        char validSelections[] = {'r', 'p', 's', 'x'}; // The three valid choices
        boolean playing = true;
        // Make a scanner
        Scanner scan = new Scanner(System.in);
        //Make a random object
        Random rand = new Random();

        // Game starts
        // Display rules of the game
        System.out.println();
        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper, and 's' for scissors. To exit choose 'x'");
        while (playing) {
            System.out.println("*****************************************************");
            System.out.print("Wins:" + wins);
            System.out.println("\tLosses:" + losses);
            System.out.println("Players Choice:");
            // Get player input
            try {
                playerChoice = scan.next().charAt(0);
            } catch (Exception e) {
                System.out.println("Invalid selection please play again.");
                continue;
            }
            // Computer randomly selects choice
            computerChoice = validSelections[rand.nextInt(3)];


            // Determine whether the player wins, loses, draws, or cancels
            if (playerChoice == ('x')) {
                System.out.println("Thank you for playing!");
                playing = false;
                continue;
            } else if (playerChoice == ('r')) {
                if (computerChoice == ('r')) {
                    System.out.println("Draw!");
                    System.out.print("Computer choice: rock");
                } else if (computerChoice == ('s')) {
                    System.out.println("You Win!");
                    System.out.print("Computer choice: scissors");
                    wins += 1;
                } else if (computerChoice == ('p')) {
                    System.out.println("You Lose!");
                    System.out.print("Computer choice: paper");
                    losses += 1;
                }
                System.out.println("\tPlayer choice: rock");
            } else if (playerChoice == ('s')) {
                if (computerChoice == ('s')) {
                    System.out.println("Draw!");
                    System.out.print("Computer choice: scissors");
                } else if (computerChoice == ('p')) {
                    System.out.println("You Win!");
                    System.out.print("Computer choice: paper");
                    wins += 1;
                } else if (computerChoice == ('r')) {
                    System.out.println("You Lose!");
                    System.out.print("Computer choice: rock");
                    losses += 1;
                }
                System.out.println("\tPlayer choice: scissors");
            } else if (playerChoice == ('p')) {
                if (computerChoice == ('p')) {
                    System.out.println("Draw!");
                    System.out.print("Computer choice: paper");
                } else if (computerChoice == ('r')) {
                    System.out.println("You Win!");
                    System.out.print("Computer choice: rock");
                    wins += 1;
                } else if (computerChoice == ('s')) {
                    System.out.println("You Lose!");
                    System.out.print("Computer choice: scissors");
                    losses += 1;
                }
                System.out.println("\tPlayer choice: paper");
            } else {
                System.out.println("Invalid selection please play again.");
            }
        }
    }
}