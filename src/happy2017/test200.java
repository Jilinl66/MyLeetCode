package happy2017;

//200. Number of Islands
public class test200 {
	int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int m = grid.length,  n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(grid[i][j] == '1') {
        			dfs(grid, i, j);
        			count++;
        		}
        	}
        }
        return count;
    }
    
    private void dfs(char[][] grid, int i, int j) {
    	if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') // == '0', RETURN
			return;
		grid[i][j] = '0';
		for(int[] d: dirs) {
			int newX = i + d[0];
			int newY = j + d[1];
			System.out.println(newX + " " + newY);
			dfs(grid, newX, newY);
		}
	}
}

/** Amazon Microsoft Google Facebook Zenefits
 */
