/* This program determines the factorial of a number entered by a
 * user. */

import java.util.Scanner;

public class factorial {

    public static void main(String args[]){
        int num, factorial = 1, i;

        //Scanner object for capturing the user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive integer: ");
        //Stored the entered value in variable
        num = scanner.nextInt();

        //We make use of a for loop
        for (i = 1; i <= num; i++){
            factorial = factorial * i;
        }

        System.out.println(num + " = " + factorial);
    }
}
