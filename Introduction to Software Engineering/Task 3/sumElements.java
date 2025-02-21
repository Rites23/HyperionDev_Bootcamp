/* This is a program that returns the sum of all elements in a specified
   column of a two-dimensional array */

import java.util.Scanner;

public class sumElements {

    /* Main Method */
    public static void main(String[] args) {

        /* The following will be used for 3-by-4 array: */
        double[][] array = getArray();

        /* The sum of each column will be displayed */
        for (int col = 0; col < array[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(array, col));
        }
    }

/* The array is initialized with the user input */
    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLUMNS = 4;
        double[][] m = new double[ROWS][COLUMNS];

/* We ask the user to enter a 3-by-4 array. Note the program would not accept a . but a , instead.*/
        System.out.println("Enter a " + ROWS + "-by-" + COLUMNS + " array row by row:");
        for (int row = 0; row < m.length; row++)
            for (int col = 0; col < m[row].length; col++)
                m[row][col] = input.nextDouble();
        return m;
    }

/* This would display the sum of elements */
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}


