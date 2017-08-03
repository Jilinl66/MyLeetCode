package happy2017;

import java.util.Arrays;

//169. Majority Element
public class test169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int target = (int) (Math.floor(nums.length/2) + 1);
        int count = 1;
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] == nums[i - 1]){
        		count ++;
        		if(count == target)
        			return nums[i];
        	}
        	else
        		count = 1;
        }
        return nums[0];
    }
}
