/*
 * Binary search is one of the searching techniques applied when the input is sorted here we are focusing on 
 * finding the middle element that acts as a reference frame whether to go left or right to it as the elements are already sorted. 
 * This searching helps in optimizing the search technique with every iteration is referred to as binary search and 
 * readers do stress over it as it is indirectly applied in solving questions.
 * 
 * Binary Search Algorithm:
 * Step 1: Start.
 * Step 2: Take the input array and target.
 * Step 3: Initialise start = 0 and end = (array size -1)
 * Step 4: Initilise mid variable.
 * Step 5: mid = (start + end)/2
 * Step 6: If array[mid] == target then return the mid.
 * Step 7: If array[mid] < target then start = mid + 1.
 * Step 8: If array[ mid ] > target then end = mid-1.
 * Step 9: If start <= end then go to Step 5.
 * Step 10: return -1 as Not element found.
 * Step 11: Exit.
 * 
 * Time Complexity: O(log N)
 * Space Complexity: O(1), If the recursive call stack is considered then the auxiliary space will be O(log N)
 */
public class BinarySearch {
    public static int iterativeBinarySearch(int[] arr, int target) {
        int leng = arr.length - 1;

        int i = 0;
        while (i <= leng) {
            int mid = (i + leng) / 2;
            System.out.println(mid);

            if (arr[mid] == target) { 
                return mid;
            } else if (arr[mid] > target){
                leng = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int start, int leng, int target){
        if (leng >= start){
            int mid = start + (leng - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target){
                leng = mid - 1;
                return recursiveBinarySearch(arr, leng, mid -1, target);
            } 
            return recursiveBinarySearch(arr, mid + 1, start, target);
        }
        return -1;

    }
}