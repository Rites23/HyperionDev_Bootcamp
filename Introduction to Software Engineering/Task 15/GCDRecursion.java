import java.util.*;

public class GCDRecursion {

    public static void main(String args[]) {

        //Enter two numbers whose GCD needs to be calculated.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first number to find GCD?");
        int numX = keyboard.nextInt();
        System.out.println("Please enter your second number to find GCD?");
        int numY = keyboard.nextInt();

        // While loop to determine (GCD) for two numbers x and y
        while (numX != numY) {
            if(numX > numY)
                numX = numX - numY;
            else
                numY = numY - numX;
        }

        System.out.printf("The GCD of given numbers above is: %d", numY);
    }

}



