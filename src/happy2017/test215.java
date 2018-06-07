package happy2017;

// 215. Kth Largest Element in an Array

public class test215 {
	public int findKthLargest(int[] nums, int k) {
		k = nums.length - k;
		int low = 0, high = nums.length - 1;
		while(low < high) {
			int j = partition(nums, low, high);
			if(k < j) {
				high = j - 1;
			}
			else if (k > j) {
				low = j + 1;
			}
			else {
				break;
			}
		}
		return nums[k];
	}
	
	private int partition(int[] nums, int low, int high) {
		int i = 0, j = high + 1;
		while(true) {
			while(i < high && nums[++i] < nums[low]);
			while(j > low && nums[low] < nums[--j]);
			if(i >= j)
				break;
			swap(nums, i, j);
		}
		swap(nums, low, j);
		return j;
	}
	
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
