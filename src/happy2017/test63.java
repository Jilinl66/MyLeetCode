package happy2017;
//63. Unique Paths II 
public class test63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid.length == 0) return 0;
		int m = obstacleGrid.length, n = obstacleGrid[0].length;
		int[][] dp = new int[m][n];
		dp[0][0] = obstacleGrid[0][0] == 1? 0: 1;
		for(int i = 1; i < m; i++)
			dp[i][0] = obstacleGrid[i][0] == 1? 0: dp[i - 1][0];
		for(int j = 1; j < n; j++)
			dp[0][j] = obstacleGrid[0][j] == 1? 0: dp[0][j - 1];
		for(int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++) {
				dp[i][j] = obstacleGrid[i][j] == 1? 0: dp[i - 1][j] + dp[i][j - 1];
			}
		}
		return dp[m - 1][n - 1];
	}
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int m = obstacleGrid.length, n = obstacleGrid[0].length;
//        int[][] map = new int[m][n];
//        for(int i = m - 1; i >= 0; i--){
//        	if(obstacleGrid[i][n - 1] == 0)
//        		map[i][n - 1] = 1;
//        	else{
//        		while(i >= 0)
//        			map[i--][n - 1] = 0;
//        		break;
//        	}
//        }
//        for(int i = n - 1; i >= 0; i--){
//            if(obstacleGrid[m - 1][i] == 0)
//        		map[m - 1][i] = 1;
//        	else{
//        		while(i >= 0)
//        			map[m - 1][i--] = 0;
//        		break;
//        	}
//        }
//		for(int i = m - 2; i >=0; i--){
//			for(int j = n - 2; j >= 0; j--){
//				if(obstacleGrid[i][j] == 1)
//					map[i][j] = 0;
//				else
//					map[i][j] = map[i][j + 1] + map[i + 1][j];
//			}
//		}
//		return map[0][0];
//    }
}
