package happy2017;
//34. Search for a Range
public class test34 {
    public int[] searchRange(int[] nums, int target) {
    	int[] res = {-1, -1};
    	if(nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) return res;
    	int lessThan, greatThan;
    	lessThan = greaterEqualThan(nums, target - 1);
    	if(nums[nums.length - 1] == target)
    		greatThan = nums.length;
    	else
    		greatThan = greaterEqualThan(nums, target);
    	if(lessThan <= greatThan - 1)
    		return new int[]{lessThan, greatThan - 1};
    	else
    		return res;
    }
    
    private int greaterEqualThan(int[] nums, int threshold) {
    	int lo = 0, hi = nums.length - 1;
    	while(lo < hi) {
    		int mid = (lo + hi) /2;
    		if(nums[mid] <= threshold)
    			lo = mid + 1;
    		else
    			hi = mid;    		
    	}
    	System.out.println(lo);
    	return lo;
    }
}
