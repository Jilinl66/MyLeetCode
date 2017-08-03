package happy2017;

import java.util.Comparator;
import java.util.PriorityQueue;

//407. Trapping Rain Water II
public class test407 {
	public class Cell {
		int row;
		int col;
		int height;
		public Cell(int row, int col, int height){
			this.row = row;
			this.col = col;
			this.height = height;
		}
	}
    public int trapRainWater(int[][] heightMap) {
        if(heightMap == null || heightMap.length == 0) return 0;
        PriorityQueue<Cell> queue = new PriorityQueue<>(1, new Comparator<Cell>() {
        	public int compare(Cell c1, Cell c2){
        		return c1.height - c2.height;
        	}
		});
        
        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        for(int i = 0; i < m; i++){
        	visited[i][0] = true;
        	visited[i][n - 1] = true;
        	queue.offer(new Cell(i, 0, heightMap[i][0]));
        	queue.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
        }
        for(int j = 0; j < n; j++){
        	visited[0][j] = true;
        	visited[m - 1][j] = true;
        	queue.offer(new Cell(0, j, heightMap[0][j]));
        	queue.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
        }
        int volume = 0;
        while(!queue.isEmpty()){
        	Cell cell = queue.poll();
        	for(int[] d: dirs){
        		int r = cell.row + d[0];
        		int c = cell.col + d[1];
        		if(r < 0 || r >= m || c < 0 || c >= n || visited[r][c])
        			continue;
        		visited[r][c] = true;
        		volume += Math.max(cell.height - heightMap[r][c], 0);
        		System.out.println(volume);
        		queue.offer(new Cell(r, c, Math.max(cell.height, heightMap[r][c])));
        	}
        }
        return volume;
    }
}
