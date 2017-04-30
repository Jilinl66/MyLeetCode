package locked;

import java.util.LinkedList;
import java.util.Queue;

//490. The Maze
public class test490 {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        visited[start[0]][start[1]] = true;
        Queue<String> queue = new LinkedList<>();
        queue.offer(String.valueOf(start[0]) + "-" + String.valueOf(start[1]));
        while(!queue.isEmpty()) {
        	String[] str = queue.poll().split("-");
    		int startX = Integer.parseInt(str[0]);
    		int startY = Integer.parseInt(str[1]);
        	for(int[] d: dirs) {
        		int x = startX; //need a new x, y
        		int y = startY;
        		while(x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == 0) {
        			x += d[0];
        			y += d[1];
        		}
        		x -= d[0];
        		y -= d[1];
        		if(visited[x][y]) continue;
        		visited[x][y] = true;
        		if(x == destination[0] && y == destination[1])
        			return true;
        		queue.offer(String.valueOf(x) + "-" + String.valueOf(y));
        	}
        }
        return false;
    }
}
