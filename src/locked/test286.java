package locked;

//286. Walls and Gates
public class test286 {
	int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public void wallsAndGates(int[][] rooms) {
        if(rooms == null || rooms.length == 0) return;
        for(int i = 0; i < rooms.length; i++){        
        	for(int j = 0; j < rooms[0].length; j++){
        		if(rooms[i][j] == 0)
        			dfs(rooms, i, j, new boolean[rooms.length][rooms[0].length]);
        	}
        }
    }
    
    
    private void dfs(int[][] rooms, int i, int j, boolean[][] visited) {
		for(int[] d: dirs) {
			int row = i + d[0];
			int col = j + d[1];
			if(row < 0 || row >= rooms.length || col < 0 || col >= rooms[0].length || rooms[row][col] < rooms[i][i] + 1.) 
				continue;
			rooms[row][col] = Math.min(rooms[row][col], rooms[i][j] + 1);
			visited[row][col] = true;
			dfs(rooms, row, col, visited);
		}
	}
}

//Facebook Google