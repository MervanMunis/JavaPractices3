
/*
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands. 
 * In this article, we will write the program on Insertion Sort in Java.
 * 
 * Step 1: Variable declared i=1.
 * Step 2: Traverse the Array till i<N.
 * Step 3: If arr[i]<arr[i-1] then arr[j]=value present after shifting the elements of the array from j to i-1.
 * Step 4: Return the Sorted Array.
 * 
 * Time Complexity: O(N2) 
 * Space Complexity: O(1)
 * 
 * Time Complexity: O(N^2) 
 * Auxiliary Space: O(1)
 */
public class InsertionSort {
    static int[] insertionSort(int[] arr) {
        int n = arr.length; 

        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j--;
            } 
            arr[j + 1] = key; 
        }
        return arr;
    }
}