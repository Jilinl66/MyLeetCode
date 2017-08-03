package happy2017;

import java.util.Arrays;

//473. Matchsticks to Square
public class test473 {
    public boolean makesquare(int[] nums) {
    	if(nums == null || nums.length < 4) return false;
    	int sum = 0;
        for(int len: nums)
        	sum += len;
        if(sum % 4 != 0) return false;
        Arrays.sort(nums);
        return DFS(nums, new int[4], nums.length - 1, sum/4);
    }
    
    private boolean DFS(int[] nums, int[] sums, int index, int target){
    	if(index < 0){
    		if(sums[0] == target && sums[0] == target && sums[0] == target)
    			return true;
    		return false;
    	}
    	for(int i = 0; i < 4; i++){
    		if(sums[i] + nums[index] > target) continue;
    		sums[i] += nums[index];
    		if(DFS(nums, sums, index - 1, target)) return true;
    		sums[i] -= nums[index];
    	}
    	return false;
    }
}
