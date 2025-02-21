import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Calculator {

    public static void main(String[] args) throws IOException {

        // Opening the text file
        File file = new File("output.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        // User can enter a integer or a float value
        double num1, num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the first number: \n");
        num1 = keyboard.nextDouble();

        // User can enter a integer or a float value
        System.out.print("Please enter the second number: \n");
        num2 = keyboard.nextDouble();

        System.out.print("Please select the operator: (+, -, *, /): ");
        char operator = keyboard.next().charAt(0);

        keyboard.close();
        double output;

        // Depending on the user input, one of the four cases will be used in the equation.
        switch (operator) {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            // If the user enters anything else apart from +, -, * and /
            // the following message will be displayed.
            default:
                System.out.printf("You have entered a wrong operator!");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+output);

        // The user input will be written to the output.txt file.
        writer.write(num1+" "+operator+" "+num2+" = "+output);
        writer.flush();
        writer.close();
        System.out.println("Equation entered above written to text file");
    }
}


