/*
 * Given an array arr[] of n elements, write a function to search a given element x in arr[]. 
 * ALGORITHM for Linear Search
 * Step 1: Start
 * Step 2: Declare an array and search element as key.
 * Step 3: Traverse the array until the number is fond.
 * Step 4: If the key element is found, return the index position of the array element.
 * Step 5: If the key element is not found, return -1.
 * Stop.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class LinearSearch {
    public static int linearSerach(int[] arr, int target){
        int n = arr.length;

        for (int i = 0; i < n; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
