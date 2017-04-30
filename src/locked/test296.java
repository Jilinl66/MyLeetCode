package locked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//296. Best Meeting Point
public class test296 {
    public int minTotalDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        List<Integer> I = new ArrayList<>();
        List<Integer> J = new ArrayList<>();
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(grid[i][j] == 1) {
        			I.add(i);
        			J.add(j);
        		}
        	}
        }
        int xDis = getMin(I);
        int yDis = getMin(J);
        return xDis + yDis;
    }
    
    public int getMin(List<Integer> list) {
		int dis = 0;
		Collections.sort(list);
		for(int i = 0, j = list.size() - 1; i < j; i++, j--)
			dis += list.get(j) - list.get(i);
		return dis;
	}
}

//Twitter