package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//347. Top K Frequent Elements
public class test347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> fremap = new HashMap<Integer, Integer>();
		List<Integer>[] bucket = new List[nums.length + 1];
    	for(int n: nums)
        	fremap.put(n, fremap.getOrDefault(n, 0) + 1);
    	for(int key: fremap.keySet()){
    		int freq = fremap.get(key);
    		if(bucket[freq] == null)
    			bucket[freq] = new ArrayList<Integer>();
    		bucket[freq].add(key);
     	}
    	List<Integer> res = new ArrayList<Integer>();
    	for(int i = bucket.length - 1; i >=0 && res.size() < k; i--){
    		if(bucket[i] != null){
    			for(int j = 0; j < bucket[i].size(); j++){
    				res.add(bucket[i].get(j));
    				if(res.size() == k)
    					break;    		
    			}
    		}
    	}
    	return res;
    }
}
