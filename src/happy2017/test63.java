package happy2017;
//63. Unique Paths II 
public class test63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] map = new int[m + 1][n + 1];
        map[m][n - 1] = 1;
		for(int i = m - 1; i >=0; i--)
			for(int j = n - 1; j >= 0; j--)
				map[i][j] = obstacleGrid[i][j] == 1? 0: map[i][j + 1] + map[i + 1][j];
		return map[0][0];
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
