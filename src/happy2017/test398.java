package happy2017;

import java.util.Random;

//398. Random Pick Index 
public class test398 {
	int[] nums;
	Random random = new Random();
	
    public test398(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    public int pick(int target) {
    	int count = 0, pick = -1;
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] != target) continue;
    		if(random.nextInt(++count) == 0)
    			pick = i;
    	}
    	return pick;
    }
}
