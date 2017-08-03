package happy2017;
//33. Search in Rotated Sorted Array
public class test33 {    
    public int search(int[] nums, int target) {
    	int lo = 0, hi = nums.length - 1;
    	while(lo <= hi) {
    		int mid = (lo + hi) /2;
    		if(nums[mid] == target) return mid;
    		else{
				if((nums[mid] > nums[hi] && (target <= nums[hi] || target > nums[mid])) || (nums[mid] < nums[hi] && target > nums[mid] && target <= nums[hi]))
					lo = mid + 1;
				else
					
					hi = mid - 1;
    		}
    	}
    	return -1;
    }
}

/**  LinkedIn Bloomberg Uber Facebook Microsoft
 *  
 */