package happy2017;
//287. Find the Duplicate Number

public class test287 {
	 public int findDuplicate(int[] nums) {
		 if(nums.length <= 1) return -1;
		 int fast = nums[nums[0]];
		 int slow = nums[0];
		 while(fast != slow) {
			 fast = nums[nums[fast]];
			 slow = nums[slow];
		 }
		 fast = 0;
		 while(fast != slow) {
			 fast = nums[fast];
			 slow = nums[slow];
		 }
		 return slow;
	 }
}
/** Bloomberg
 * Two pointer, Binary search
 */
