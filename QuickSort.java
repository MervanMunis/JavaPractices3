/*
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array 
 * around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
 * 
 * Always pick first element as pivot. 
 * Always pick last element as pivot (implemented below) 
 * Pick a random element as pivot.
 * Pick median as pivot.
 */
public class QuickSort {
    /* low  --> Starting index,  high  --> Ending index */
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++){
            if (arr[j] <= pivot){
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    } 

    static void sort(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}