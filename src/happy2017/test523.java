package happy2017;

import java.util.HashMap;
import java.util.Map;

//523. Continuous Subarray Sum
public class test523 {
    public boolean checkSubarraySum(int[] nums, int k) {
    	Map<Integer, Integer> map = new HashMap<>();
    	map.put(0, -1);
    	int runningSum = 0;
    	for(int i = 0; i < nums.length; i++){
    		runningSum += nums[i];
    		if(k != 0)
    			runningSum %= k;
			Integer prev = map.get(runningSum);
			if(prev != null){
				if(i - prev > 1)
					return true;
			}
			else 
				map.put(runningSum, i);
    	}
    	return false;
    }
    
//    public boolean checkSubarraySum(int[] nums, int k) {
//        int[] dp = new int[nums.length];
//        for(int i = 0; i < nums.length; i++){
//        	for(int j = 0; j < i; j++){
//        		dp[j] += nums[i];
//        		if((k == 0 && dp[j] == 0) || (k != 0 && dp[j] % k == 0))
//        			return true;
//        	}
//        	dp[i] = nums[i];
//        }
//        return false;
//    }
}
