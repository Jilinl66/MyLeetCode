package happy2017;

import java.util.HashMap;
import java.util.Map;

//525. Contiguous Array
public class test525 {
    public int findMaxLength(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        	if(nums[i] == 0) nums[i] = -1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i ++){
        	sum += nums[i];
        	if(map.get(sum) == null)
        		map.put(sum, i);
        	else
        		max = Math.max(max, i - map.get(sum));
        }
        return max;
    }
}
