package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//15. 3Sum
public class test15 {
    public List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> res = new ArrayList<>();
    	for(int i = 0; i < nums.length - 2; i++) {
    		if(i > 0 && nums[i] == nums[i - 1]) continue;
    		int lo = i + 1, hi = nums.length - 1;
    		while(lo < hi) {
    			if(nums[lo] + nums[hi] + nums[i] == 0) {
    				res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
    				while(lo < hi && nums[lo + 1] == nums[lo]) lo++;
    				while(lo < hi && nums[hi - 1] == nums[hi]) hi--;
    				lo++;
    				hi--;
    			}
    			else if(nums[lo] + nums[hi] + nums[i] < 0) lo++;
    			else hi--; 
    		}
    	}
    	return res;
    }
}

/** Amazon Microsoft Bloomberg Facebook Adobe Works Applications
 * Two pointer
 */
