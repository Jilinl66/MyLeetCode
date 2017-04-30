package happy2017;

import java.util.Arrays;

//377. Combination Sum IV
public class test377 {
	int[] memo;
    public int combinationSum4(int[] nums, int target) {
    	if(nums.length == 0 || target < 0) return 0;
    	memo = new int[target + 1];
    	Arrays.fill(memo, -1);
    	memo[0] = 1;
    	return sumHelper(nums, target);
    }
    
    private int sumHelper(int[] nums, int target) {
    	if(memo[target] != -1)
    		return memo[target];
    	int res = 0;
    	for (int i = 0; i < nums.length; i++)
        	if(target >= nums[i])
        		res += sumHelper(nums, target - nums[i]);
        memo[target] = res;
        return res;
    }
}
