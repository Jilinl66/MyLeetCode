package happy2017;

import java.util.Arrays;

//16. 3Sum Closest
public class test16 {
    public int threeSumClosest(int[] nums, int target) {
    	if(nums.length < 3)
    		return 0;
        Arrays.sort(nums);
    	int closest = nums[0] + nums[1] + nums[nums.length - 1], sum = 0;
        for(int i = 0; i < nums.length - 2; i++){
        	int start = i + 1, end = nums.length - 1;
        	while(start < end){
        		sum = nums[i] + nums[start] + nums[end];
        		if(sum < target)
        			start ++;
        		else
        			end --;
        		if(Math.abs(sum - target) < Math.abs(closest - target))
        			closest = sum;
        	}
        }
        return closest;
    }
}
