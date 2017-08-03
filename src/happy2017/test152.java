package happy2017;
//152. Maximum Product Subarray
public class test152 {
    public int maxProduct(int[] nums) {
    	if(nums.length == 0) return 0;
    	int maxherepre = nums[0];
    	int minherepre = nums[0];
    	int maxSofar = nums[0];
    	int maxhere, minhere;
    	for(int i = 1; i < nums.length; i++) {
    		maxhere = Math.max(Math.max(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
    		minhere = Math.min(Math.min(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
    		maxSofar = Math.max(maxSofar, maxhere);
    		maxherepre = maxhere;
    		minherepre = minhere;
    	}
    	return maxSofar;
    }
}

/** LinkedIn
 */
