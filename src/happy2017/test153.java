package happy2017;

///153. Find Minimum in Rotated Sorted Array
public class test153 {
    public int findMin(int[] nums) {
    	int lo = 0, hi = nums.length - 1;
    	while(lo < hi) {
    		if(nums[lo] < nums[hi]) break;
    		int mid = (lo + hi) / 2;
    		if(nums[lo] < nums[mid] || nums[hi] < nums[mid])
    			lo = mid + 1;
    		else 
    			hi = mid;
    	}
    	return nums[lo];
    }
}
/** Microsoft
 */