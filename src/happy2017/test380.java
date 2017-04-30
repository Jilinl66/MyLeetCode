package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

//380. Insert Delete GetRandom O(1)
public class test380 {
	ArrayList<Integer> nums;
	HashMap<Integer, Integer> map;
	Random random = new Random();
    /** Initialize your data structure here. */
    public test380() {
        nums = new ArrayList<>();
        map = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val, nums.size());
        nums.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int loc = map.get(val);
        if(loc < nums.size() - 1){
        	int last = nums.get(nums.size() - 1);
        	nums.set(loc, last);
        	map.put(last, loc);
        }
        nums.remove(nums.size() - 1);
        map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}
