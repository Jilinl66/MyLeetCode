package happy2017;
//62. Unique Paths
public class test62 {
	public int uniquePaths(int m, int n) {
		int[][] map = new int[m][n];
		for(int i = 0; i < m; i++)
			map[i][0] = 1;
		for(int i = 0;i < n; i++)
			map[0][i] = 1;
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++)
				map[i][j] = map[i - 1][j] + map[i][j - 1];
		}
		return map[m - 1][n - 1];
	}
//    public int uniquePaths(int m, int n) {
//        return backtrack(0, 0, m, n);
//    }
//    
//    private int backtrack(int r, int c, int m, int n) {
//    	if(r == m - 1 && c == n - 1)
//    		return 1;
//    	if(r >=m || c >= n)
//    		return 0; 
//    	return backtrack(r + 1, c, m, n) + backtrack(r, c + 1, m, n);
//	}
}
