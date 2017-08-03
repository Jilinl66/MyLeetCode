package happy2017;
//279. Perfect Squares
public class test279 {
    public int numSquares(int n) {
    	int[] dp = new int[n + 1];
    	for(int i = 1; i <= n; i++) {
    		int count = (int) Math.sqrt(i);
    		int min = Integer.MAX_VALUE;
    		for(int k = 1; k <= count; k++)
    			min = Math.min(min, dp[i - k * k] + 1);
    		dp[i] = min;
    	}
    	return dp[n];
    }
}