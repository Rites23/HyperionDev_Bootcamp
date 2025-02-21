// Import methods from the builtin methods

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Arrays;

class MyFile {
    public static void main(String[] args) throws IOException {

        // Creates a BufferedWriter to write data to output file

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        // Opens the input.txt file for reading
        // Try and Catch block for checking if file exists and prints an error message if not

        try {
            File calculations = new File("src\\input.txt");
            Scanner keyboard = new Scanner(calculations);

            while (keyboard.hasNextLine()) {

                // Splitting the data and removing the words - "min, max and avg"

                String[] data = keyboard.nextLine().split(":");
                String[] list = data[1].trim().split(",");

                // Creating an Integer List

                List<Integer> elements = new ArrayList<>();

                for (String st : list) {
                    elements.add(Integer.parseInt(st));
                }

                double result_Avg = 0;

                // Using conditional statements for calculating Min, Max and Avg

                switch (data[0]) {

                    // Finding Min Value

                    case "min" -> {
                        int choice = calcMin(elements);

                        writer.write("The min of " + elements + " is " + choice + "\n");
                    }

                    // Finding Max Value

                    case "max" -> {
                        int choice = calcMax(elements);

                        writer.write("The Max of " + elements + " is " + choice + "\n");
                    }

                    // Finding Average Value

                    case "avg" -> {
                        int sum = 0;
                        for (int i : elements) {
                            sum += i;
                            result_Avg = calcAvg(elements, sum);

                        }
                        // Writing data to the output file

                        writer.write("The Avg of " + elements + " is " + result_Avg + "\n");

                        writer.write("The sum of " + elements + " is " + sum + "\n");

                    }
                }
            }

            // Catch Block for printing errors if any

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        // Percentile of a list

        // Position of number in list

        float x ;

        // percentile

        int p ;

        // Creating 2 separate Integer Lists

        int[] my_Array_1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] my_Array_2 = {1, 2, 3};

        //  Defining the lengths of each Integer List

        int len1;
        int len2;
        len1 = my_Array_1.length;
        len2 = my_Array_2.length;

        // Scanner input
        Scanner keyboard = new Scanner(System.in);

        // Entry of percentile value
        System.out.println("\nPlease enter the percentile you want to calculate [ 10 - 90 ] " +
                "in this list " + Arrays.toString(my_Array_1) + " : ");
        x = keyboard.nextInt();

        // Percentile calculations
        p = calcPercentile(x, len1);

        // Writing data to the output file
        writer.write("The " + x + " th percentile of " + Arrays.toString(my_Array_1) + " is " + p + "\n");


        // Entry of percentile value
        System.out.println("\nPlease enter the percentile you want to calculate [ 10 - 90 ] " +
                "in this list " + Arrays.toString(my_Array_2) + " : ");
        x = keyboard.nextInt();

        // Percentile calculations
        p = calcPercentile(x, len2);

        // Writing data to the output file
        writer.write("The " + x + " th percentile of " + Arrays.toString(my_Array_2) + " is " + p );
        writer.close();
    }

    private static int calcPercentile(float x, int len1) {
        int p;
        p = (int) (x / 100 * len1);
        return p;
    }

    private static double calcAvg(List<Integer> elements, double sum) {
        double result_Avg;
        result_Avg = sum / (double) elements.size();
        return result_Avg;
    }

    private static int calcMax(List<Integer> elements) {
        return Collections.max(elements);
    }

    private static int calcMin(List<Integer> elements) {
        return Collections.min(elements);
    }
}

