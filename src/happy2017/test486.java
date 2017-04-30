package happy2017;
//486. Predict the Winner
//IMPORTANT!
public class test486 {
    public boolean PredictTheWinner(int[] nums) {
        if(nums == null || nums.length == 0) return true;
        int n = nums.length;
        int[] dp = new int[n];
        for(int i = 0; i < n; i++)
        	dp[i] = nums[i];
        for(int i = n - 2; i >= 0; i--){
        	for(int j = i + 1; j < n; j++){
        		dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
        	}
        }
        return dp[n - 1] >= 0;
    }
}
