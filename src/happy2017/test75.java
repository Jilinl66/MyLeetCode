package happy2017;
//75. Sort Colors
public class test75 {
    public void sortColors(int[] nums) {
    	int i = 0, j = nums.length - 1;
    	for(int k = 0; k <= j; k++) {
    		if(nums[k] == 2) {
    			swap(nums, k, j);
    			k--;
    			j--;
    		}
    		else if(nums[k] == 0) {
    			swap(nums, i, k);
    			i++;
    		}
    	}
    }
    
    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
