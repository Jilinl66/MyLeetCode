package happy2017;

//96. Unique Binary Search Trees
public class test96 {
	int[] dp;
    public int numTrees(int n) {
    	dp = new int[n];
    	dp[0] = 1;
    	dp[1] = 1;
    	for(int i = 2; i <= n; i++) {
    		for(int j = 1; j <= i; j++) {
    			dp[i] += dp[j - 1] * dp[i - j];
    		}
    	}
    	return dp[n];
    }
}
/** Snapchat
 * 
 */