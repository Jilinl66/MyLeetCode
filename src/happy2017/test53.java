package happy2017;
//53. Maximum Subarray
public class test53 {
    public int maxSubArray(int[] nums) {
        int maxHere = nums[0];
        int maxSofar = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	maxHere = Math.max(maxHere + nums[i], nums[i]);
        	maxSofar = Math.max(maxHere, maxSofar);
        }
        return maxSofar;
    }
}
