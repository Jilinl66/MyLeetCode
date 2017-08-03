package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//368. Largest Divisible Subset
public class test368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        int[] pre = new int[n];
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int maxLen = Integer.MIN_VALUE, last = -1;
        for(int i = 0; i < n; i++){
        	count[i] = 1;
        	pre[i] = -1;
        	for(int j = i - 1; j >= 0; j--){
        		if(nums[i] % nums[j] == 0 && count[j] + 1 > count[i]){
        			count[i] = count[j] + 1;
        			pre[i] = j;
        		}
        	}
        	if(count[i] > maxLen){
        		maxLen = count[i];
        		last = i;
        	}
        }
        while(last >= 0){
        	res.add(nums[last]);
        	last = pre[last];
        }
        return res;
    }
}
