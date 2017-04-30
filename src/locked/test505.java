package locked;

import java.util.Comparator;
import java.util.PriorityQueue;

//505. The Maze II
public class test505 {
	int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m, n;
    class Point {
    	int x;
    	int y;
    	int l;
    	public Point(int x, int y, int l) {
			this.x = x;
			this.y = y;
			this.l = l;
		}
    }
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
    	m = maze.length;
        n = maze[0].length;
        int[][] length = new int[m][n];
        for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				length[i][j] = Integer.MAX_VALUE;
        PriorityQueue<Point> queue = new PriorityQueue(new Comparator<Point>() {
        	@Override
        	public int compare(Point p1, Point p2) {
        		return p1.l - p2.l;
        	}
		});
        queue.offer(new Point(start[0], start[1], 0));
        while(!queue.isEmpty()) {
        	Point currP = queue.poll();
        	if(length[currP.x][currP.y] <= currP.l)
        		continue;
        	length[currP.x][currP.y] = currP.l;
        	for(int[] d: dirs) {
        		int x = currP.x;
        		int y = currP.y;
        		int l = currP.l;
        		while(x + d[0] >= 0 && x + d[0] < m && y + d[1] >= 0 && y + d[1] < n && maze[x + d[0]][y + d[1]] == 0) {
        			x += d[0];
        			y += d[1];
        			l ++;
        		}
        		queue.offer(new Point(x, y, l));
        	}
        }
        return length[destination[0]][destination[1]] == Integer.MAX_VALUE? -1: length[destination[0]][destination[1]];
    }

    
    /**
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        m = maze.length;
        n = maze[0].length;
        minLen = Integer.MAX_VALUE;
        boolean[][] visited = new boolean[m][n];
        visited[start[0]][start[1]] = true;
        dfs(maze, start, destination, visited, 0);
        return minLen == Integer.MAX_VALUE? -1: minLen; //if not found
    }
    
    private void dfs(int[][] maze, int[] start, int[] destination, boolean[][] visited, int count) {
    	int startX = start[0];
    	int startY = start[1];
    	for(int[] d: dirs) {
    		int x = startX;
    		int y = startY;
    		int c = 0;
    		while(x + d[0] >= 0 && x + d[0] < m && y + d[1] >= 0 && y + d[1] < n && maze[x + d[0]][y + d[1]] == 0) {
    			c ++;
    			x += d[0];
    			y += d[1];
    		}
    		if(x == destination[0] && y == destination[1]) {
    			minLen = Math.min(minLen, count + c);
    			return;
    		}
    		if(visited[x][y]) continue; // "continue" not "return"
    		visited[x][y] = true;
    		dfs(maze, new int[]{x, y}, destination, visited, count + c);
    		visited[x][y] = false;
    	}
	}
	**/
}
