package happy2017;
//31. Next Permutation
public class test31 {
    public void nextPermutation(int[] nums) {
    	int len = nums.length;
    	int i = len - 1;
    	while(--i >= 0 && nums[i] >= nums[i + 1]){}
    	if(i < 0)
    		reverse(nums, 0, len - 1);
    	else{
    		for(int m = len -1; m > i; m--)
    			if(nums[m] > nums[i]){
    				swwap(nums, i, m);
    				break;
    			}
			reverse(nums, i + 1, len - 1);
    	}
    }
    
    private void reverse(int[] nums, int start, int end) {
		while(start < end){
			swwap(nums, start, end);
			start ++;
			end --;
		}	
	}
    
    private void swwap(int[] A, int a, int b) {
    	if(a == b) return;
    	int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
}
