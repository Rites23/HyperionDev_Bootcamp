public class QuickSort {

    public static void QuickSort(int[] list) {
        QuickSort(list, 0, list.length - 1);
    }

    public static void QuickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            QuickSort(list, first, pivotIndex - 1);
            QuickSort(list, pivotIndex + 1, last);
        }
    }

    // Partition the array list
    public static int partition(int[] list, int first, int last) {
        int middle = list[(list.length - 1) / 2];
        // choose the median element as the pivot
        int pivot = median(first, middle, last);
        // Index forward search
        int low = first + 1;
        // Index backward search
        int high = last;

        while (high > low) {
            // Search forward from the left
            while (low <= high && list[low] <= pivot)
                low++;

            // Search backward from the right
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 6, 2, 9, 8, 4, -7, 13, 15, 12};
        QuickSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

    public static int median(int first, int middle, int last) {
        return Math.max(Math.min(first, middle),
                Math.min(Math.max(first, middle), last));
    }
}

