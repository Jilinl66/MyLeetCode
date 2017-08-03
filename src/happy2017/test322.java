package happy2017;

import java.util.Arrays;

//322. Coin Change
public class test322 {
    public int coinChange(int[] coins, int amount) {
    	int[] dp = new int[amount + 1];
    	Arrays.fill(dp, Integer.MIN_VALUE);
    	dp[0] = 0;
    	for(int i = 1; i <= amount; i++) {
    		for(int j = 0; j < coins.length; j++) {
    			if(i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MIN_VALUE) {
    				if(dp[i] == Integer.MIN_VALUE)
    					dp[i] = dp[i - coins[j]] + 1;
    				else
    					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
    			}
    		}
    	}
    	return dp[amount] == Integer.MIN_VALUE? -1: dp[amount];
    }    
}
