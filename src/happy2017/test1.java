package happy2017;

import java.util.HashMap;

//1. Two Sum
public class test1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]))
				return new int[]{map.get(nums[i]), i};
			else
				map.put(target - nums[i], i);
		}
        throw new IllegalArgumentException("No two sum solution");
    }
}

/**
 * LinkedIn Uber Airbnb Facebook Amazon Microsoft Apple Yahoo Dropbox Bloomberg Yelp Adobe
 * Array, HashTable
 * look up in hash table should be amortized O(1) 
 */