package happy2017;
//376. Wiggle Subsequence
public class test376 {
    public int wiggleMaxLength(int[] nums) {
    	int len = nums.length;
        if(len == 0 || len == 1) return len;
        int start = 0;
        while(start < len - 1 && nums[start] == nums[start + 1]) start++;
        if(start == len - 1) return 1;
        int maxLen = 2;
        boolean st = nums[start] < nums[start + 1]; //starting pattern
        for(int i = start + 1; i < len - 1; i++){
        	if(st && nums[i] > nums[i + 1]){
        		maxLen ++;
        		st = !st;
        	}
        	else if(!st && nums[i] < nums[i + 1]){
        		maxLen ++;
        		st = !st;
        	}
        }
        return maxLen;
    }
}
