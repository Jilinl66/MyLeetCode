package locked;

import java.util.HashSet;

//548. Split Array with Equal Sum
public class test548 {
    public boolean splitArray(int[] nums) {
    	int len = nums.length;
        if(len < 7) return false;
        int[] sum = new int[len];
        sum[0] = nums[0];
        for(int i = 1; i < len; i++)
        	sum[i] = sum[i - 1] + nums[i];
        for(int j = 3; j < len - 3; j++) {
        	HashSet<Integer> set = new HashSet<>();
        	for(int i = 1; i < j - 1; i++) {
        		if(sum[i - 1] == sum[j - 1] - sum[i])
        			set.add(sum[i - 1]);
        	}
        	for(int k = j + 2; k < len - 1; k++) {
        		if(sum[k - 1] - sum[j] == sum[len - 1] -sum[k] && set.contains(sum[len - 1] - sum[k]))
        			return true;
        	}
        }
        return false;
    }
}

//Alibaba