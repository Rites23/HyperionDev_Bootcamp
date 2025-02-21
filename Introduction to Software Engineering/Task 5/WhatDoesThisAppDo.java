import java.util.Scanner;

public class WhatDoesThisAppDo {

    public static void main(String[] args) {

        // We will ask the user 5 Questions.
        // We also changed the final int Number = 5 to the below:
        final int NUMBER_OF_QUESTIONS = 5;

        // int int2 = 0 is changed to the below:
        int rightCount = 0;

        // int int1 = 0 is changed to the below:
        int count = 0;

        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // We ask the user to enter the answer for "What is number1 - number2?"
            System.out.print(
                    "What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // The answer is calculated and the result is displayed.
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                rightCount++; // Increase the correct answer count.
            }
            else
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2));

            count++;

            output += "\n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + rightCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
