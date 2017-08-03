package happy2017;
//416. Partition Equal Subset Sum
public class test416 {
    public boolean canPartition(int[] nums) {
    	if(nums == null || nums.length == 0) return true;
        int sum = 0;
        for(int i: nums)
        	sum += i;
        if(sum % 2 == 1) return false;
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for(int i = 0; i < nums.length; i++){
        	for(int j = sum; j >= nums[i]; j--)
        		dp[j] = dp[j] || dp[j - nums[i]];
        }
        return dp[sum];
    }
}
