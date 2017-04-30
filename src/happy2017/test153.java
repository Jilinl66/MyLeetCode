package happy2017;

///153. Find Minimum in Rotated Sorted Array
public class test153 {
    public int findMin(int[] nums) {
        if(nums.length == 0) return 0;
        int low = 0, high = nums.length - 1;
        while(low < high){
        	int mid = (low + high)/2;
        	if(mid > 0 && nums[mid] < nums[mid - 1])
        		return nums[mid];
        	if(nums[mid] >= nums[low] && nums[mid] > nums[high])
        		low = mid + 1;
        	else
        		high = mid - 1;
        }
        return nums[low];
    }
}
