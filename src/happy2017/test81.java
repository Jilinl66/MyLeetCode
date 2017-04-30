package happy2017;
//81. Search in Rotated Sorted Array II
public class test81 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        int low = 0, high = nums.length - 1, mid = -1;
        while(low <= high){
        	mid = (low + high)/2;
        	if(nums[mid] == target) return true;
        	if(nums[mid] < nums[high] || nums[mid] < nums[low]){
        		if(target > nums[mid] && target <= nums[high])
        			low = mid + 1;
        		else
        			high = mid - 1;
        	}
        	else if(nums[mid] > nums[low] || nums[mid] > nums[high]){
        		 if(target >= nums[low] && target < nums[mid])
        			 high = mid - 1;
        		 else
        			 low = mid + 1;
        	}
        	else
        		high --;
        }
        return false;
    }
}
