/* Game -  Allows the user to play rock, paper, scissors.
 * The program randomly generates a number (0, 1 or 2), which
 * represents scissors, rock and paper.
 */

/*
 We import the Random function to generate a random number choice.
 We import the Scanner function to take input from the user.
*/

import java.util.Random;
import java.util.Scanner;

// We create class name.

public class rockPaperScissors {

    public static void main(String[] args) {

        // We declare the Random method.

        Random score = new Random();

        // We declare our variables.

        int choice;
        int userChoice;

        // We create a new scanner for the input from the user.

        Scanner input = new Scanner(System.in);

        System.out.println("\n1 - Rock beats 0 - Scissors");
        System.out.println("\n0 - Scissors beats 2 - Paper");
        System.out.println("\n2 - Paper beats 1 - Rock");
        System.out.println("\nYou are playing a Random Game of Paper, Rock, Scissors\n");
        System.out.println("\nEach token [0 - Scissors 1 - Rock 2 - Paper are token with the choice of 0, 1 and 2");
        System.out.println("\nPlease enter a choice from 0 - 2 which is preselected randomly : ");

        userChoice = input.nextInt();

        choice = score.nextInt(3);

        // Output is printed to screen.

        System.out.println("\nYour choice is " + userChoice);
        System.out.println("\nThe Random choice is " + choice);

        // if , Else If , conditional statements to determine the result of the game.

        if  (userChoice == choice) {

            System.out.println("\nYou Draw - Draw computer");


        } else if (userChoice == 0 ) {
            if (choice==1)
            {
                System.out.println("\nYou Lose - Scissors 0");
                System.out.println("\nComputer Wins - Rock 1");
            }
            else {
                System.out.println("\nYou Win - Scissors 0");
                System.out.println("\nComputer Loses - Paper 2");
            }


        } else if (userChoice == 1) {
            if (choice==0)
            {
                System.out.println("\nYou Win - Rock 1");
                System.out.println("\nComputer Loses - Scissors 0");
            }
            else {
                System.out.println("\nYou Lose - Rock 1");
                System.out.println("\nComputer Wins - Paper 2");
            }


        } else if (userChoice == 2) {
            if (choice==0)
            {
                System.out.println("\nYou Lose - Paper 2");
                System.out.println("\nComputer Wins - Scissors 0");
            }
            else {
                System.out.println("\nYou Win - Paper 2");
                System.out.println("\nComputer Loses - Rock 1");
            }

        }

    }
}
