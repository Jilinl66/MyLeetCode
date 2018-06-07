package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

//Insert Delete GetRandom O(1) - Duplicates allowed
public class test381 {
	Map<Integer, Set<Integer>> map;
	ArrayList<Integer> arrList;
	Random random;
	
    /** Initialize your data structure here. */
    public RandomizedCollection() {
    	map = new HashMap<>();
    	arrList = new ArrayList<>();
    	random = new Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        int idx = arrList.size();
        arrList.add(val);
        if(map.containsKey(val)) {
        	map.get(val).add(idx);
        	return false;
        }
        else {
        	map.put(val, new HashSet<>());
        	map.get(val).add(idx);
        	return true;
        }
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val) || map.get(val).size() == 0) return false;
        int idx = map.get(val).iterator().next();
        map.get(val).remove(new Integer(idx));
        if(idx == arrList.size() - 1) {
        	arrList.remove(idx);
        }
        else {
        	int last = arrList.size() - 1;
        	arrList.set(idx, arrList.get(last));
        	int num = arrList.get(last);
        	map.get(num).remove(last);
        	map.get(num).add(idx);
        	arrList.remove(last);
        }
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
    	int idx = random.nextInt(arrList.size());
    	return arrList.get(idx);
    }
}
