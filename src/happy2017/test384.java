package happy2017;

import java.util.LinkedList;
import java.util.Random;

//384. Shuffle an Array
public class test384 {
	int[] copy;
	Random random;
	int size;
	
    public Solution(int[] nums) {
    	copy = nums;
    	random = new Random();
    	size = copy.length;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return copy;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	LinkedList<Integer> list = new LinkedList<>();
    	for(int i = 0; i < size; i++)
        	list.add(copy[i]);
        int[] res = new int[size];
        int i = 0;
        while(i < size) {
        	int rand = random.nextInt(list.size());
        	res[i ++] = list.get(rand);
        	list.remove(rand);
        }
        return res;
    }
}
