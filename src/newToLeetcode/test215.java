package newToLeetcode;
// 215. Kth Largest Element in an Array
import java.util.Arrays;

public class test215 {
	public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
