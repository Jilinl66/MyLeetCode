package happy2017;

import java.util.HashMap;
import java.util.Map;

//128. Longest Consecutive Sequence
public class test128 {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int num: nums){
        	if(!map.containsKey(num)){
	        	int left = map.containsKey(num - 1)? map.get(num - 1): 0;
	        	int right = map.containsKey(num + 1)? map.get(num + 1): 0;
	        	int newLen = left + right + 1;
	        	map.put(num, newLen);
	        	maxLen = Math.max(maxLen, newLen);
	        	map.put(num - left, newLen);
	        	map.put(num + right, newLen);
        	}
        }
        return maxLen;
    }
}