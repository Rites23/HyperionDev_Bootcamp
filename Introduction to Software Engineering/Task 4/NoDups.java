
import java.util.*;

public class NoDups {
    public static int removeDuplicateElements(int[] arr, int n) {


        if (n == 0 || n == 1) {
            return n;
        }

        // We do a for loop to check the next element to check for duplicates

        int j = 0;
        for (int i = 0; i < n-1; i++) {

            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        }

        arr[j++] = arr[n-1];

        return j;
    }

    public static void main(String[] args ){
        int[] arr = {20, 100, 10, 80, 70, 1, 0, -1, 2, 10, 15, 300, 7, 6, 2, 18, 19, 21, 9,0};

        // We print the array elements before the sort and removal of duplicate elements

        System.out.println("\nArray before sort and removal of duplicate numbers. \n");
        for (int j : arr) System.out.print(j + " ");
        Arrays.sort(arr);
        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        // We print the array elements after the sort and removal of duplicate elements

        System.out.println();

        System.out.println("\nArray after sort and removal of duplicate numbers. \n");

        for ( int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

    }
}




