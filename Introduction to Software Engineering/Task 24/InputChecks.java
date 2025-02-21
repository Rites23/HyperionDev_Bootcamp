// Software Engineering Task 24 - Capstone Project III

import java.util.Scanner;

// PoisedInputChecks is the Poised Project superclass.
// This class contains three check methods for different user inputs.
// These methods are inherited by the three subclasses of the program to ensure all user input is correctly checked.

    public class InputChecks {  // Main class declaration.

         // This method verifies user input when asked to enter an integer
         // @param type describes the input required for the user to enter
         // @return returns the verified output integer

        public static int intCheck(String type) {

            while(true) {  // While loop repeatedly re-prompts for input until correct.
                Scanner numInput = new Scanner(System.in);
                String number = numInput.nextLine();

                try {
                    int output = Integer.parseInt(number);  // Attempting to parse the input to an integer (i.e. checking for correct input).
                    return output;

                } catch (NumberFormatException ex) {
                    System.out.println("Incorrect entry. Please re-enter the " + type + ": \n");  // Error message displayed if parsing is not possible.

                }
            }
        }

         // This method verifies user input when asked to enter a string.
         // @param type describes the input required for the user to enter
         // @return returns the verified user input

        public static String stringCheck(String type) {

            while(true) {  // While loop repeatedly re-prompts for input until correct.
                Scanner userInput = new Scanner(System.in);
                String input = userInput.nextLine();

                if ((input == null) || (input.length() > 150)) {  // Checking if the input is empty, too short, or too long.
                    System.out.println("Incorrect entry. Please re-enter the " + type + ": \n");

                } else {
                    return input;  // Returning the user's correctly input string.

                }
            }
        }

         // This method verifies user input when asked to enter a double number.
         // @param type describes the input required for the user to enter
         // @return returns the verified output double

        public static double doubleCheck(String type) {

            while(true) {  // While loop repeatedly re-prompts for input until correct.
                Scanner doubleInput = new Scanner(System.in);
                String number = doubleInput.nextLine();

                try {
                    double output = Double.parseDouble(number);  // Attempting to parse the input to a double (i.e. checking for correct input).
                    return output;

                } catch (NumberFormatException ex) {
                    System.out.println("Incorrect entry. Please re-enter the " + type + ": \n");  // Error message displayed if parsing is not possible.

                }
            }
        }
    }


