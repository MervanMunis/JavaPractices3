
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/*
 * Each day a quarry-worker is given a pile of stones and told to reduce the larger stones into smaller
 * ones. The worker must smash the stones together to reduce them, and is told to always pick up 
 * the largest two stones and smash them together. If the stones are of equal weight, they both disintegrate entirely. 
 * If one is larger, the smaller one is disintegrated and the larger one is reduced by the weight of the smaller one.
 * Eventually, there is either one stone left that cannot be broken, or all of the stones have been smashed. 
 * Determine the weight of the last stone, or return 0 if there is none.
 * 
 * EX: weights = [1,2,3,6,7,7].
 * The worker always starts with the two largest stones. In this case, the two largest stones have equal weights of 7 
 * so they both disintegrate when smashed. Next the worker smashes weights 3 and 6. The smaller one is destroyed and the larger
 * weighs 6 - 3 = 3 units. Then, weights 3 and 2 are smashed together, which leaves a stone of weight 1. 
 * This is smashed with the last remaining stone of weight 1. There are no stones left, so the remaining stone weight is 0.
 * 
 */
public class CrashingStones {

    /**
     * @param weights
     * @return
     */
    static int lastStoneWeight(List<Integer> weights){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(weights);
        
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            
            if (stone1 != stone2) {
                int remainingWeight = stone1 - stone2;
                maxHeap.add(remainingWeight);
            }
        }
        
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
    
}
