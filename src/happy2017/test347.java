package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//347. Top K Frequent Elements
public class test347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> res = new ArrayList<>();
		Map<Integer, Integer> freqMap = new HashMap<>();
    	for(int num: nums)
    		freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    	TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
    	for(int key: freqMap.keySet()) {
    		int freq = freqMap.get(key);
    		if(!treeMap.containsKey(freq))
    			treeMap.put(freq, new ArrayList<>());
    		treeMap.get(freq).add(key);
    	}
    	while(res.size() < k) {
    		Map.Entry<Integer, List<Integer>> entry = treeMap.pollLastEntry();
    		res.addAll(entry.getValue());
    	}
    	return res;
	}
	/** 
	 * Bucket Sort
	  public List<Integer> topKFrequent(int[] nums, int k) {
    	List<Integer> res = new ArrayList<>();
    	List<Integer>[] buckets = new ArrayList[nums.length + 1];
    	Map<Integer, Integer> freqMap = new HashMap<>();
    	for(int num: nums)
    		freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    	for(int key: freqMap.keySet()) {
    		int freq = freqMap.get(key);
    		if(buckets[freq] == null)
    			buckets[freq] = new ArrayList<>();
    		buckets[freq].add(key);
    	}
    	for(int i = buckets.length - 1; res.size() < k; i--)
    		if(buckets[i] != null)
    			res.addAll(buckets[i]);
    	return res;
    }
	 */
    
}
