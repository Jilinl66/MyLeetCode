package happy2017;
//154. Find Minimum in Rotated Sorted Array II
public class test154 {
    public int findMin(int[] nums) {
        if(nums.length == 0) return 0;
        int low = 0, high = nums.length - 1;
        while(low < high){
        	int mid = (low + high)/2;
        	if(nums[mid] > nums[high])
        		low = mid + 1;
        	else if(nums[mid] < nums[high])
        		high = mid;
        	else
        		high --;
        }
        return nums[low];
    }
}
