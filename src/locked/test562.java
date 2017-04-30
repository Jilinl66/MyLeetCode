package locked;

//562. Longest Line of Consecutive One in Matrix
public class test562 {
    public int longestLine(int[][] M) {
        if(M.length == 0) return 0;
        int max = 0;
        int m = M.length, n = M[0].length;
        int[][][] dp = new int[m][n][4];
        for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(M[i][j] == 0) continue;
				for(int k = 0; k < 4; k ++)
					dp[i][j][k] = 1;
				if(j > 0) dp[i][j][0] += dp[i][j - 1][0]; // horizontal line
				if(i > 0 && j > 0) dp[i][j][1] += dp[i - 1][j - 1][1]; // anti-diagonal line
				if(i > 0) dp[i][j][2] += dp[i - 1][j][2]; // vertical line
				if(i > 0 && j < n - 1) dp[i][j][3] += dp[i -1][j + 1][3]; // diagonal line
				for(int k = 0; k < 4; k++)
					max = Math.max(max, dp[i][j][k]);
			}
		}
        return max;
    }
}
 