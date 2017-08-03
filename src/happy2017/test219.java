package happy2017;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//219. Contains Duplicate II
public class test219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++){
			if(i > k) set.remove(nums[i - k - 1]);
			if(!set.add(nums[i])) return true;
		}
		return false;
	}
//	Method2 use map, slower
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//    	Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//        	if(!map.containsKey(nums[i]))
//            		map.put(nums[i], i);
//        	else if(Math.abs(map.get(nums[i]) - i) <= k)
//        		return true;
//        	else
//        		map.replace(nums[i], i);
//        }
//        return false;
//    }
}
