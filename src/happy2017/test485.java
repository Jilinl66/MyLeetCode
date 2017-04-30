package happy2017;
//485. Max Consecutive Ones 
public class test485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curmax = 0;
        int i = 0;
        while(i < nums.length){
        	if(nums[i] == 0){
        		max = Math.max(curmax, max);
        		curmax = 0;
        		i++;
        	}
        	else{
        		while(i < nums.length && nums[i] == 1){
        			curmax ++;
        			i++;
        		}
        	}
        }
        return Math.max(curmax, max);
    }
}
