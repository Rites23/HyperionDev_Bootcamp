import java.util.*;

public class recursion {

    //Print reverse of a string using recursion.

    void reverse(String str) {
        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {

            // Reversing the characters in the string and creating a substring of the sentence.

            System.out.print(str.charAt(str.length() - 1));
            reverse(str.substring(0, str.length() - 1));
        }
    }

    // Main class to run the code, ask for user input and printing the sentence in reversed order.

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a sentence which will be reversed?");
        String str = keyboard.nextLine();
        recursion obj = new recursion();
        obj.reverse(str);

        // Main class to run the code, ask for user input of a number and print in Fibonacci Sequence.

        int n, first = 0, next = 1;
        System.out.println("Please enter a number which will print out the Fibonacci numbers thereafter?");
        n = keyboard.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        int i = 1;
        while (i < n - 1) {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }
    }
}
