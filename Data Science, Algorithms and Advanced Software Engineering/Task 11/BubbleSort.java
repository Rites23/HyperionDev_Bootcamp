public class BubbleSort {

    public static void sortStrings(String[] arr, int n) {
        //Strings are sorted using bubble sort
        String bubble;

        // loop to access each array element
        for (int j = 0; j < n; j++) {

            // loop to compare array elements
            for (int i = j + 1; i < n; i++) {

                // compare two elements change > to < to sort in descending order
                if (arr[j].compareTo(arr[i]) > 0) {
                    // swapping occurs if elements are not in the intended order
                    bubble = arr[j];
                    arr[j] = arr[i];
                    arr[i] = bubble;
                }
            }
        }
    }

    //Main Method
    public static void main(String[] args) {

        String[] arr = {"right", "subdued", "trick", "crayon", "punishment", "silk", "describe", "royal", "prevent",
                "slope"};

        int n = arr.length;
        sortStrings(arr, n);
        System.out.println("Strings sorted: ");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}