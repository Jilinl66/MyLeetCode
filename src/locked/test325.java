package locked;

import java.util.HashMap;

//325. Maximum Size Subarray Sum Equals k
public class test325 {
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(sum == k)
				maxLen = i + 1;
			else if(map.containsKey(sum - k))
					maxLen = Math.max(maxLen, i - map.get(sum - k));
			if(!map.containsKey(sum))
				map.put(sum, i);
		}
        return maxLen;
    }
}

// Palantir Facebook
//HashTable