/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements 
 * if they are in the wrong order. Bubble Sort in Java is not the best method to sort an array but is 
 * one of the most basic implementations for one to learn. In this article, 
 * we will learn how to write a program for Bubble Sort in Java.
 *
 * Step 1: Start
 * Step 2: Initiate two values n as size of array ,also i and j to traverse array.
 * Step 3: Put i=0 and j=1.
 * Step 4: While traversing if array[i] > array[j] swap both the numbers.
 * Step 5: Increment the value i and j then goto Step 3.
 * Step 6: If the value of i > n-1 and j > n and n>1 then
 *            * n=n-1
 *            * goto Step 2
 * Step 7: Exit
 * 
 * Time Complexity: O(N2) 
 * Space Complexity: O(1)
 * 
 * Time Complexity: O(n2)
 * Auxiliary Space: O(1)
 */
public class BubbleSort {

    static int[] bubbleSort(int[] arr){
        int n = arr.length; 

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { 
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            }
        }
        return arr;
    }
}
