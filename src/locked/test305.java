package locked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//305. Number of Islands II
public class test305 {
	int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
	public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> res = new ArrayList<>();
    	int numOfIsland = 0;
        int[] roots = new int[m * n];
        Arrays.fill(roots, -1);
    	
        for(int[] p: positions) {   
        	int root =  n * p[0] + p[1]; //Good point
        	roots[root] = root;
        	numOfIsland++;
        	for(int[] d: dirs) {
        		int row = p[0] + d[0];
        		int col = p[1] + d[1]; 
        		int neighbourIndex = row *n + col;
        		if(row < 0 || row >= m || col < 0 || col >= n || roots[neighbourIndex] == -1)
        			continue;
        		int rootNeighbour = findRoot(roots, neighbourIndex);
        		if(root != rootNeighbour) {
        			roots[root] = rootNeighbour;
        			root = rootNeighbour;
        			numOfIsland--;
        		}
        	}
        	res.add(numOfIsland);
        }
        return res;
	}
	
    private int findRoot(int[] roots, int index) {
    	while(index != roots[index]) {
    		roots[index] = roots[roots[index]];
    		index = roots[index];
    	}
    	return index;
    }
	
	//Too slow
//    public List<Integer> numIslands2(int m, int n, int[][] positions) {
//    	int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//    	int[][] island = new int[m][n];
//    	int numOfIsland = 0;
//        List<Integer> res = new ArrayList<>();
//        for(int i = 0; i < positions.length; i++) {
//        	int x = positions[i][0];
//        	int y = positions[i][1];
//        	island[x][y] = i + 1;
//        	numOfIsland++;
//        	for(int[] d: dirs) {
//        		int row = x + d[0];
//        		int col = y + d[1]; 
//        		if(row < 0 || row >= m || col < 0 || col >= n || island[row][col] == 0 || island[row][col] == i + 1)
//        			continue;
//    			setIsland(island, island[row][col], i + 1);
//    			numOfIsland--;
//        	}
//        	res.add(numOfIsland);
//        }
//        return res;
//    }
//    
//    
//    public void setIsland(int[][] island, int oldVal, int newVal) {
//    	for (int i = 0; i < island.length; i++)
//			for (int j = 0; j < island[0].length; j++)
//				if(island[i][j] == oldVal)
//					island[i][j] = newVal;
//    }
}

//Google
//Union find
