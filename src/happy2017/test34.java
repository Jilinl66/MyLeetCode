package happy2017;
//34. Search for a Range
public class test34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1, -1};
        int start = findGreaterEqual(nums, target);
        if(start == nums.length || nums[start] > target) 
        	return new int[]{-1, -1};
        int end = findGreaterEqual(nums, target + 1);
        return new int[]{start, end - 1};
    }
    
    private int findGreaterEqual(int[] nums, int target){
    	 int low = 0, high = nums.length;
    	 while(low < high){
    		 int mid = low + (high - low)/2;
    		 if(nums[mid] < target)
    			 low = mid + 1;
    		 else
    			 high = mid; 
    	 }
    	 return low;
    }
}
