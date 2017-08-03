package happy2017;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//542. 01 Matrix
public class test542 {
    public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
    	if(matrix.size() == 0 || matrix.get(0).size() == 0) return matrix;
    	int m = matrix.size(), n = matrix.get(0).size();
    	Queue<int[]> queue = new LinkedList<>();
    	for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j ++){
				if(matrix.get(i).get(j) == 0)
					queue.add(new int[]{i, j});
				else
					matrix.get(i).set(j, Integer.MAX_VALUE);
			}
		}
    	int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    	while(!queue.isEmpty()){
    		int[] cell = queue.poll();
    		for(int[] d: dirs){
    			int r = cell[0] + d[0];
    			int c = cell[1] + d[1];
    			if(r < 0 || r >= m || c < 0 || c >= n)
    				continue;
    			if(matrix.get(r).get(c) == Integer.MAX_VALUE){
    				queue.add(new int[]{r, c});
    				matrix.get(r).set(c, matrix.get(cell[0]).get(cell[1]) + 1);
    			}
    		}
    	}
    	return matrix;
    }
}
