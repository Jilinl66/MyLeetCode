package locked;

//351. Android Unlock Patterns 
public class test351 {
	public int numberOfPatterns(int m, int n) {
		boolean[] visited = new boolean[10];
		int[][] skip = new int[10][10];
		skip[1][3] = skip[3][1] = 2;
        skip[1][7] = skip[7][1] = 4;
        skip[3][9] = skip[9][3] = 6;
        skip[7][9] = skip[9][7] = 8;
        skip[1][9] = skip[9][1] = skip[2][8] = skip[8][2] = skip[3][7] = skip[7][3] = skip[4][6] = skip[6][4] = 5;
        int res = 0;
        for(int i = m; i <= n; i++) {
        	res += dfs(visited, skip, 1, i - 1) * 4;
        	res += dfs(visited, skip, 2, i - 1) * 4;
        	res += dfs(visited, skip, 5, i - 1);
        }
        return res;
	}
	
	public int dfs(boolean[] visited, int[][] skip, int cur, int remain) {
		if(remain < 0) return 0;
		if(remain == 0) return 1;
		int res = 0;
		visited[cur] = true;
		for(int i = 1; i <= 9; i++) {
			if(!visited[i] && (skip[cur][i] == 0 || visited[skip[cur][i]]))
				res += dfs(visited, skip, i, remain - 1);
		}
		visited[cur] = false;
		return res;
	}
	
	/**
    public int numberOfPatterns(int m, int n) {
    	boolean[][] screen = new boolean[3][3];
        int[] counts = new int[10];
        backtracking(screen, counts, m, n, 0, -1);
        int res = 0;
        for(int i = m; i <= n; i++) {
        	res += counts[i];
        }
        return res;
    }
    
    private void backtracking(boolean[][] screen, int[] counts, int m, int n, int numOfKeys, int last) {
    	if(numOfKeys > n)
    		return;
    	if(numOfKeys >=m && numOfKeys <= n) 
    		counts[numOfKeys] ++;
    	 for(int i = 0; i < 9; i++) {
    		 int row = i/3;
    		 int col = i%3;
    		 if(screen[row][col] || (last != -1 && !isValid(screen, i, last))) continue;
    		 
    		 screen[row][col] = true;
    		 backtracking(screen, counts, m, n, numOfKeys + 1, i);
    		 screen[row][col] = false;
    	 }
	}
    
    private boolean isValid(boolean[][] screen, int i, int j) {
    	int r1 = i/3, c1 = i%3, r2 = j/3, c2 = j%3;
    	return Math.abs(r1 - r2) % 2 == 1 || Math.abs(c1 - c2) % 2 == 1 || screen[(r1 + r2)/2][(c1 +c2)/2];
    }
    **/
}
