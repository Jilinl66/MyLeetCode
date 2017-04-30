package happy2017;

//213. House Robber II
public class test213 {
    public int rob(int[] nums) {
    	if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int len = nums.length;
        int[] a1 = new int[len - 1];
        int[] a2 = new int[len - 1];
        System.arraycopy(nums, 0, a1, 0, nums.length - 1);
        System.arraycopy(nums, 1, a2, 0, nums.length - 1);
        return Math.max(robHelper(a1), robHelper(a2));
    }
    
    public int robHelper(int[] num) {
        int[][] dp = new int[num.length + 1][2];
        for (int i = 1; i <= num.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = num[i - 1] + dp[i - 1][0];
        }
        return Math.max(dp[num.length][0], dp[num.length][1]);
    }
}
