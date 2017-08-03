package happy2017;
//31. Next Permutation
public class test31 {
    public void nextPermutation(int[] nums) {
        if(nums.length < 2) return;
        int i = nums.length - 1;
        while(i > 0 && nums[i] <= nums[i - 1])
        	i--;
        if(i == 0) {
        	reverse(nums, 0, nums.length - 1);
        	return;
        }
        i --;
        int k = i + 1;
        while(k < nums.length && nums[k] > nums[i])
        	k ++;
        k--;
        swap(nums, i, k);
        reverse(nums, i + 1, nums.length - 1);
    }
    public void swap(int[] nums, int i, int k) {
    	int temp = nums[i];
    	nums[i] = nums[k];
    	nums[k] = temp;
	}
    
    public void reverse(int[] nums, int i, int j) {
		while(i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++; j--;
		}
	}
}
