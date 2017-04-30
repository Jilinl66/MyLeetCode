package locked;

//361. Bomb Enemy
public class test361 {
	int m, n;
	public int maxKilledEnemies(char[][] grid) {
		if(grid == null || grid.length == 0) return 0;
    	m = grid.length;
    	n = grid[0].length;
    	int max = 0;
    	int row = 0;
    	int[] cols = new int[n];
    	for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(grid[i][j] == 'W') continue;
        		if(j == 0 || grid[i][j - 1] == 'W')
        			row = calRow(grid, i, j);
        		if(i == 0 || grid[i - 1][j] == 'W')
        			cols[j] = calCol(grid, i, j);
        		if(grid[i][j] == '0')
        			max = Math.max(max, row + cols[j]);
        	}
    	}
    	return max;
	}
	
	public int calRow(char[][] grid, int i, int j) {
		int count = 0;
		while(j < n && grid[i][j] != 'W') {
			if(grid[i][j] == 'E')
				count++;
			j++;
		}
		return count;
	}
	
	public int calCol(char[][] grid, int i, int j) {
		int count = 0;
		while(i < m && grid[i][j] != 'W') {
			if(grid[i][j] == 'E')
				count++;
			i++;
		}
		return count;
	}
	
	/**
    public int maxKilledEnemies(char[][] grid) {
    	if(grid == null || grid.length == 0) return 0;
    	int m = grid.length, n = grid[0].length;
    	int max = 0;
        int[][] right = new int[m][n];
        int[][] left = new int[m][n];
        int[][] top = new int[m][n];
        int[][] botton = new int[m][n];
        
        for(int i = 0; i < m; i++) {
        	for(int j = n - 2; j >= 0; j--) {
        		if(grid[i][j + 1] == 'E')
        			right[i][j] = right[i][j + 1] + 1;
        		else if(grid[i][j + 1] == 'W')
        			right[i][j] = 0;
        		else
        			right[i][j] = right[i][j + 1];
        	}
        }
        for(int i = 0; i < m; i++) {
        	for(int j = 1; j < n; j++) {
        		if(grid[i][j - 1] == 'E')
        			left[i][j] = (char) (left[i][j - 1] + 1);
        		else if(grid[i][j - 1] == 'W')
        			left[i][j] = 0;
        		else
        			left[i][j] = left[i][j - 1];
        	}
        }
        for(int j = 0; j < n; j++) {
        	for(int i = 1; i < m; i++) {
        		if(grid[i - 1][j] == 'E')
        			top[i][j] = (char) (top[i - 1][j] + 1);
        		else if(grid[i - 1][j] == 'W')
        			top[i][j] = 0;
        		else
        			top[i][j] = top[i - 1][j];
        	}
        }
        for(int j = 0; j < n; j++) {
        	for(int i = m - 2; i >= 0; i--) {
        		if(grid[i + 1][j] == 'E')
        			botton[i][j] = (char) (botton[i + 1][j] + 1);
        		else if(grid[i + 1][j] == 'W')
        			botton[i][j] = 0;
        		else
        			botton[i][j] = botton[i + 1][j];
        	}
        }
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(grid[i][j] == '0')
        			max = Math.max(right[i][j] + left[i][j] + top[i][j] + botton[i][j], max);
        	}
        }
        return max;
    }
    **/
}
