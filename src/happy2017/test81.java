package happy2017;

//81. Search in Rotated Sorted Array II
public class test81 {
    public boolean search(int[] nums, int target) {
    	int low = 0, high = nums.length - 1;
    	while(low <= high) {
    		int mid = low + (high - low)/2;
    		if(nums[mid] == target) return true;
    		if(nums[mid] < nums[low] || nums[mid] < nums[high]) {
    			if(target <= nums[high] && target > nums[mid]) {
    				low = mid + 1;
//	    			while(low < high && nums[low + 1] == nums[low])
//	    				low++;
    			}
    			else {
    				high = mid - 1;
//    				while(high > low && nums[high - 1] == nums[high])
//    					high--;
    			}
    		}
    		else if(nums[mid] > nums[low] || nums[mid] > nums[high]) {
    			 if(target >= nums[low] && target < nums[mid]) {
    				 high = mid - 1;
//    				 while(high > low && nums[high - 1] == nums[high])
//    					  high --;
    			 }
    			 else {
    				 low = mid + 1;
//    				 while(low < high && nums[low + 1] == nums[low])
// 	    				low++;
    			 }
    		}
    		else {
    			while(low <= high && nums[low] == nums[mid]) low++;
    			while(low <= high && nums[high] == nums[mid]) high--;
    		}
    	}
    	return false;
    }
}