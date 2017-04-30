package happy2017;
//303. Range Sum Query - Immutable
public class test303 {
	int[] N;
    public test303(int[] nums) {
     	N = new int[nums.length];
    	if(nums.length == 0) return;
    	N[0] = nums[0];
    	for(int i = 1; i < nums.length; i++)
    		N[i] = nums[i] + N[i - 1];
    }
    
    public int sumRange(int i, int j) {
    	return i == 0? N[j]: N[j] - N[i - 1];
    }
}
