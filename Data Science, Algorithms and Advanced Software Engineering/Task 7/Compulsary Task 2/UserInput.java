import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * userInput is used to validate all input that user will enter through-out the program
 */

public class UserInput {

    // A class that takes in user input (string)
    public static String StringInput(){

        try{
            Scanner scanner = new Scanner(System.in);

            return scanner.nextLine();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input!!");
        }

        return "Error, Please retry";
    }

    // A class that takes in user input (integer)
    public static Integer IntegerInput(){

        try{
            Scanner scanner = new Scanner(System.in);

            return scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input!!");
        }

        return 0;
    }
}

