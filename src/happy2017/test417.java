package happy2017;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//417. Pacific Atlantic Water Flow
//Good bfs example, can also use dfs
public class test417 {
	int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	int m, n;
    public List<int[]> pacificAtlantic(int[][] matrix) {
    	List<int[]> res = new ArrayList<>();
    	if(matrix.length == 0) return res;
    	m = matrix.length;
    	n = matrix[0].length;
        boolean[][] p = new boolean[m][n];
        boolean[][] a = new boolean[m][n];
        Queue<int[]> pQueue = new LinkedList<>();
        Queue<int[]> aQueue = new LinkedList<>();
        for(int i = 0; i < m; i++){
        	p[i][0] = true;
        	a[i][n - 1] = true;
        	pQueue.offer(new int[]{i, 0});
        	aQueue.offer(new int[]{i, n - 1});
        }
        for(int j = 0; j < n; j++){
        	p[0][j] = true;
        	a[m - 1][j] = true;
        	pQueue.offer(new int[]{0, j});
        	aQueue.offer(new int[]{m - 1, j});
        }
        dfs(matrix, pQueue, p);
        dfs(matrix, aQueue, a);
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(p[i][j] && a[i][j])
        			res.add(new int[]{i ,j});
        	}
        }
        return res;
    }
    
    private void dfs(int[][] matrix, Queue<int[]> queue, boolean[][] visited) {
		while(!queue.isEmpty()){
			int[] cur = queue.poll();
			for(int[] d: dirs){
				int newx = cur[0] + d[0];
				int newy = cur[1] + d[1];
				if(newx < 0 || newx >= m || newy < 0 || newy >= n || visited[newx][newy] || matrix[newx][newy] < matrix[cur[0]][cur[1]])
					continue;
				visited[newx][newy] = true;
				queue.offer(new int[]{newx, newy});
			}
		}
	}
}
