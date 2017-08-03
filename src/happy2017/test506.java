package happy2017;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//506. Relative Ranks
public class test506 {
    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        int[] copy = Arrays.copyOf(nums, len);
        Arrays.sort(nums);
        Map<Integer, String> map = new HashMap<>();
        String[] res = new String[len];
        for(int i = 0; i < len; i++){
        	if(len - i == 1)
        		map.put(nums[i], "Gold Medal");
        	else if(len - i == 2)
        		map.put(nums[i], "Silver Medal");
        	else if(len - i == 3)
        		map.put(nums[i], "Bronze Medal");
        	else
        		map.put(nums[i], String.valueOf(len - i));
        }
        for(int i = 0; i < len; i++)
        	res[i] = map.get(copy[i]);
        return res;
    }
}
