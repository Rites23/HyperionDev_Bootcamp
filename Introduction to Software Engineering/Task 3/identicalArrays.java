import java.util.*;

public class identicalArrays
{
    public static void main(String[] args)
    {
        /* We declare the appropriate variables */

        int i;

        Scanner keyboard = new Scanner(System.in);

        // First Integer Array List

        int[]  IntegerList1 = new int[6];

        System.out.println("\nPlease enter " + IntegerList1.length + " Integer Numbers for First Array List : ");

        for ( i = 0; i < IntegerList1.length; i++)
        {
            System.out.print("\nPlease enter Integer " + (i+1) + " : ");
            IntegerList1[i] = keyboard.nextInt();

        }

        System.out.println("\nYour First List of Integers are : \n");

        for ( i = 0; i < IntegerList1.length; i++)
        {
            System.out.println("Integer " + (i+1) + " : " + IntegerList1[i] + " " );
        }

        // Second Integer Array List

        int [] IntegerList2 = new int[6];

        System.out.println("\nPlease enter " + IntegerList2.length + " Integer Numbers for Second Array List : ");

        for ( i = 0; i < IntegerList2.length; i++)
        {
            System.out.print("\nPlease enter Integer " + (i+1) + " : ");
            IntegerList2[i] = keyboard.nextInt();
        }

        System.out.println("\nYour Second List of Integers are : \n");

        for ( i = 0; i < IntegerList2.length; i++)
        {

            System.out.println("Integer " +  (i+1) + " : " + IntegerList2[i] + " " );
        }

        // Comparing the Two Array Lists

        boolean ArrayMatch = true;

        int lengthArray1 = IntegerList1.length;

        // We sort the two array lists in ascending order

        Arrays.sort(IntegerList1);
        Arrays.sort(IntegerList2);

        // We print the array items

        for (i = 0; i < lengthArray1; i++)
        {
            System.out.println(IntegerList1[i]);
            System.out.println(IntegerList2[i]);
            System.out.println("...................");

            /* We match to see whether the 2 lists are identical
             * If the match is not identical
             * the loop will break at that point in the loops
             */

            if (IntegerList1[i] != IntegerList2[i])
            {
                ArrayMatch = false;
                break;
            }
        }

        if (ArrayMatch)
        {
            System.out.println("\nThe TWO ARRAYS are IDENTICAL");
        }
        else System.out.println("\nThe TWO ARRAYS are NOT IDENTICAL");
    }
}

