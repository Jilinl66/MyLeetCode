package happy2017;

import java.util.Arrays;

//414. Third Maximum Number
public class test414 {
    public int thirdMax(int[] nums) {
    	if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        for(int i = nums.length - 2; i >=0; i--){
        	if(nums[i] != nums[i + 1] && count < 3)
        		count ++;
        	if(count == 3)
        		return nums[i];
        }
        return nums[nums.length - 1];
    }
}
