package happy2017;

import java.util.Arrays;

//324. Wiggle Sort II, can't understand
public class test324 {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = nums[(n - 1)/2];
        int i = 0, left = 0, right = n - 1;
        while(i <= right){
        	if(nums[newIndex(i, n)] > median)
        		swap(nums, newIndex(left++, n), newIndex(i ++, n));
        	else if (nums[newIndex(i, n)] < median)
        		swap(nums, newIndex(right--, n), newIndex(i, n));
        	else
        		i++;
        }
    }
    
    private int newIndex(int index, int n) {
    	return (1 + 2 * index) % (n | 1);
    }
    
    private void swap(int[] nums, int i, int j) {
		if(i == j) return;
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
