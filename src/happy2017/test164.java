package happy2017;

import java.util.Arrays;

//164. Maximum Gap(Hard)
public class test164 {
    public int maximumGap(int[] nums) {
    	int len = nums.length;
    	if(nums == null || len < 2) return 0;
    	int min = nums[0];
    	int max = nums[0];
    	for(int n: nums) {
    		min = Math.min(min, n);
    		max = Math.max(max, n);
    	}
    	int gap = (int) Math.ceil((double)(max - min)/(len - 1));
    	int[] bucketsMIN = new int[len - 1];
    	int[] bucketsMAX = new int[len - 1];
    	Arrays.fill(bucketsMIN, Integer.MAX_VALUE);
    	Arrays.fill(bucketsMAX, Integer.MIN_VALUE);
    	for(int i: nums) {
    		if(i == min || i == max) continue;
    		int idx = (i - min)/gap;
    		bucketsMIN[idx] = Math.min(bucketsMIN[idx], i);
    		bucketsMAX[idx] = Math.max(bucketsMAX[idx], i);
    	}
    	int maxGap = Integer.MIN_VALUE;
    	int preMax = min;
    	for(int i = 0; i < len - 1; i++) {
    		if(bucketsMIN[i] == Integer.MAX_VALUE && bucketsMAX[i] == Integer.MIN_VALUE)
    			continue;
    		maxGap = Math.max(maxGap, bucketsMIN[i] - preMax);
    		preMax = bucketsMAX[i];
    	}
    	maxGap = Math.max(maxGap, max - preMax);
    	return maxGap;
    }
}

/** bucket sort
 */
