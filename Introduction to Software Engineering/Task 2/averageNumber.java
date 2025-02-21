/* A program that determines how many positive and negative
 *  integers have been entered and calculates the total and average of all the
 *  entered numbers*/

import java.util.Scanner;

public class averageNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Count the number of positive, negative, combined numbers and the total.
        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;


        // We ask the user to enter any number of integers.
        System.out.print("Please enter any number of integers, the input ends if it is 0: ");
        int number = input.nextInt();


        while (number != 0){
            if (number > 0)
                // Increase positives
                positives++;
            else
                // Increase negatives
                negatives++;
            // Accumulate total
            total += number;
            // Increase the count
            count++;
            number = input.nextInt();
        }

        // Calculates the average
        double average = total / count;

        // Display results
        System.out.println(
                "The number of positives is " + positives +
                        "\nThe number of negatives is " + negatives +
                        "\nThe total is " + total +
                        "\nThe average is " + average);
    }
}

