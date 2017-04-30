package happy2017;

//209. Minimum Size Subarray Sum
public class test209 {
    public int minSubArrayLen(int s, int[] nums) {
    	if(s == 0 || nums.length == 0)
    		return 0;
    	int sum = 0, start = 0, end = 0, min = Integer.MAX_VALUE;
    	while(end < nums.length){
    		sum += nums[end++];
    		while(sum >= s){
    			min = Integer.min(min, end - start);
    			sum -= nums[start++];
    		}
    	}
    	return min == Integer.MAX_VALUE? 0: min;
    }
}
