package happy2017;

import java.util.HashMap;
import java.util.LinkedHashSet;

//460. LFU Cache
public class test460 {
	HashMap<Integer, Integer> vals;
	HashMap<Integer, Integer> counts;
	HashMap<Integer, LinkedHashSet<Integer>> list;
	int cap = -1;
	int min = -1;
	
    public test460(int capacity) {
    	cap = capacity;
    	vals = new HashMap<>();
    	counts = new HashMap<>();
    	list = new HashMap<>();
    	list.put(1, new LinkedHashSet<>());
    }
    
    public int get(int key) {
        if(!vals.containsKey(key)) return -1;
        int count = vals.get(key);
        vals.put(key, count + 1);
        if(count == min && list.get(count).size() == 0)
        	min ++;
        if(!list.containsKey(count + 1))
        	list.put(count + 1, new LinkedHashSet<>());
         list.get(count + 1).add(key);
         return vals.get(key);
    }
    
    public void put(int key, int value) {
        if(cap <= 0) return;
        if(!vals.containsKey(key)){
        	vals.put(key, value);
        	get(key);
        	return;
        }
        if(vals.size() >= cap){
        	int evict = list.get(min).iterator().next();
        	list.get(min).remove(evict);
        	vals.remove(evict);
        	vals.put(key, value);
        	counts.put(key, 1);
        	min = 1;
        	list.get(1).add(key);
        }
    }
}
