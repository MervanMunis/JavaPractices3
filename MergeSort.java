/*
 * Merge Sort is a divide-and-conquer algorithm. It divides the input array into two halves, calls itself the two halves, 
 * and then merges the two sorted halves. The merge() function is used for merging two halves. 
 * The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted 
 * and merges the two sorted sub-arrays into one. 
 * 
 * Step 1: Divide Array into Two Parts.
 * Step 2: Merge Sort the first part of the array.
 * Step 3: Merge Sort the second part of the array.
 * Step 4: Merge Both the parts.
 * Step 5: Return the Sorted Array
 * 
 * Divide the Array till the size of Array is greater than 1.
 * 
 * Time Complexity: O(N logN)
 * Space Complexity: O(N)
 * 
 * 
 */
public class MergeSort {
    static void merge(int[] arr, int start, int mid, int leng){
        int n1 = mid - start + 1;
        int n2 = leng - mid;

        // Create temp arrays
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i<n1; ++i)
            left[i] = arr[start + i];
        for (int j = 0; j<n2; ++j)
            right[j] = arr[mid + 1 + j];

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = start;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }        
    }

    static void sort(int[] arr, int start, int leng){
        if (leng > start){
            // Find the middle point
            int m = (start + leng) / 2;

            // Sort first and second halves
            sort(arr, start, m);
            sort(arr, m + 1, leng);

            // Merge the sorted halves
            merge(arr, start, m, leng);
        }
    }

    
}
