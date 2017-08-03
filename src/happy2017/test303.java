package happy2017;
//303. Range Sum Query - Immutable
public class test303 {
	int[] sums;
    public test303(int[] nums) {
    	sums = new int[nums.length + 1];
    	for(int i = 1; i <= nums.length; i++)
    		sums[i] = sums[i - 1] + nums[i - 1];
    }
    
    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
