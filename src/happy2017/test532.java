package happy2017;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//532. K-diff Pairs in an Array
public class test532 {
	public int findPairs(int[] nums, int k) {
		if(nums == null || nums.length == 0 || k < 0) return 0;
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int i: nums)
			map.put(i, map.getOrDefault(i, 0) + 1);
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			if(k == 0){
				if(entry.getValue() >= 2)
					count++;
			}
			else{
				if(map.keySet().contains(entry.getKey() + k))
					count ++;
			}
		}
		return count;
	}
//    public int findPairs(int[] nums, int k) {
//    	Arrays.sort(nums);
//    	Set<String> set = new HashSet<>();
//    	if(nums == null || nums.length == 0) return 0;
//    	for(int i = 0; i < nums.length; i++){
//    		if (i > 0 && nums[i] == nums[i - 1] && k > 0)
//    			continue;
//    		for(int j = i + 1; j < nums.length; j++){
//    			if(nums[j] - nums[i] < k)
//    				continue;
//    			else {
//    				if(nums[j] - nums[i] == k)
//    					set.add(nums[i] + "-" + nums[j]);
//    				break;
//    			}		
//    		}
//    	}
//    	return set.size();
//    }
}
