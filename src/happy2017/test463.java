package happy2017;
//463. Island Perimeter
public class test463 {
    public int islandPerimeter(int[][] grid) {
    	int count = 0;
    	if(grid.length == 0) return 0;
    	int m = grid.length, n = grid[0].length;
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(grid[i][j] == 1){
                	for(int[] d:dirs){
	        			int x = i + d[0];
	        			int y = j + d[1];
	        			if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0)
	        				count ++;
        			}
        		}
        	}
        }
        return count;
    }
}
