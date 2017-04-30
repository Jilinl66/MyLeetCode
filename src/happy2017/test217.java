package happy2017;

import java.util.Arrays;

//217. Contains Duplicate
public class test217 {
    public boolean containsDuplicate(int[] nums) {
    	Arrays.sort(nums);
    	for(int i = 1; i < nums.length; i++){
    		if(nums[i] == nums[i - 1])
    			return true;
    	}
		return false;
        
    }
}
