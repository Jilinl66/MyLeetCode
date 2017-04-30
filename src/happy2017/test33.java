package happy2017;
//33. Search in Rotated Sorted Array
public class test33 {
//    public int search(int[] nums, int target) {
//        if(nums.length == 0) return -1;
//
//        for(int i = 0; i < nums.length; i++)
//        	if(target == nums[i])
//        		return i;
//        return -1;
//    }
    
    public int search(int[] nums, int target) {
    	if(nums.length == 0) return -1;
    	int low = 0, high = nums.length - 1;
    	while(low < high){
    		int mid = (low + high)/2;
    		if(nums[mid] == target)
    			return mid;
    		if(nums[low] <= nums[mid]){
    			if(target >= nums[low] && target < nums[mid])
    				high = mid - 1;
    			else
    				low = mid + 1;
    		}
    		else{
    			if(target > nums[mid] && target <= nums[high])
    				low = mid + 1;
    			else
    				high = mid - 1;
    		}
    	}
    	return nums[low] == target? low: -1;
    }
}
