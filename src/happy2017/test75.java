package happy2017;
//75. Sort Colors
public class test75 {
    public void sortColors(int[] nums) {
        int w1 = 0, b2 = 0;
        for(int i = 0; i < nums.length; i ++){
        	if(nums[i] == 0){
        		nums[i] = 2;
        		nums[b2] = 1;
        		nums[w1] = 0;
        		w1 ++;
        		b2 ++;
        	}
        	else if(nums[i] == 1){
        		nums[i] = 2;
        		nums[b2] = 1;
        		b2 ++;
        	}
        }
    }
}
