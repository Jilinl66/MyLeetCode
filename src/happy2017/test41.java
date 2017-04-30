package happy2017;
//41. First Missing Positive
public class test41 {
    public int firstMissingPositive(int[] nums) {
    	if(nums.length == 0) return 1;
    	int k = partition(nums) + 1;
    	int first_missing_index = k;
    	for(int i = 0; i < k; i++){
    		int temp = Math.abs(nums[i]);
    		if(temp <= k)
    			nums[temp - 1] *= (nums[temp - 1] < 0? 1: -1);
    	}
    	for(int i = 0; i < k; i++){
    		if(nums[i] > 0){
    			first_missing_index = i;
    			break;
    		}
    	}
    	return first_missing_index + 1;
    }
    
    public int partition(int[] A){
    	int lastPositive = -1;
    	for(int i = 0; i < A.length; i++){
    		if(A[i] > 0){
    			lastPositive ++;
    			swap(A, i, lastPositive);
    		}
    	}
    	return lastPositive;
    }
    
    public void swap(int[] nums, int a, int b){
    	if(a == b) return;
    	int temp = nums[a];
    	nums[a] = nums[b];
    	nums[b] = temp;
    }
}
