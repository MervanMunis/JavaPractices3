
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of integers, what is the length of the longest subarray containing no more than two distinct values such that
 * the distinct values differ by no more than 1?
 * 
 * EX: arr = [0,1,2,1,2,3]
 * The largest such subarray has length 4: [1,2,1,2]
 * 
 * EX: arr = [1,1,1,3,3,2,2]
 * The largest such subarray has length 4: [3,3,2,2].
 * The values 1 and 3 differ by more than 1 so [1,1,1,3,3] is not vaild.
 */
public class LongestSubarray {

    static int longestSubarray(List<Integer> arr){
        if (arr == null || arr.isEmpty()) {
            return 0; 
        }

        int maxLength = 0; // to keep track of the maximum length of the subarray found.
        int left = 0; 
        Map<Integer, Integer> frequencyMap = new HashMap<>(); // Use a map to store the frequency of each value in the current window.

        for (int right = 0; right < arr.size(); right++){
            int currValue = arr.get(right);

            // Update the frequency map for the current value
            frequencyMap.put(currValue, frequencyMap.getOrDefault(currValue, 0) + 1);

            // Check if the window contains more than two distinct values or if the distinct values differ by more than 1
            while (frequencyMap.size() > 2 || (frequencyMap.size() == 2 && !isDifferenceWithinLimit(frequencyMap))) {
                int leftValue = arr.get(left);

                // Decrease the frequency of the value at the left pointer
                frequencyMap.put(leftValue, frequencyMap.get(leftValue) - 1);

                // If the frequency becomes zero, remove the value from the map
                if (frequencyMap.get(leftValue) == 0) {
                    frequencyMap.remove(leftValue);
                }
                
                // Move the left pointer to shrink the window
                left++;
            }

                // Update the maximum length found
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    
    // Helper method to check if the two distinct values in the frequency map differ by no more than 1
    static boolean  isDifferenceWithinLimit(Map<Integer, Integer> frequencyMap) {
        
        int[] distinctValues = new int[2];
        int index = 0;

        for (Integer key : frequencyMap.keySet()){
            distinctValues[index++] = key;
        }

        // Calculate the absolute difference and return true if it is within the limit (<= 1)
        return Math.abs(distinctValues[0] - distinctValues[1]) <= 1;
    }
    
}
