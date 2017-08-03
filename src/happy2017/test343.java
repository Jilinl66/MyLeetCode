package happy2017;
//343. Integer Break
public class test343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        if(n == 1 || n == 2) return 1;
        if(n == 3) return 2;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i <= n; i++){
        	dp[i] = Math.max(dp[i - 2] * 2, dp[i - 3] * 3);
        }
        return dp[n];
    }
}
