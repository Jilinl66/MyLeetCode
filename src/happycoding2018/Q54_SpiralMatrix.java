package happycoding2018;

import java.util.ArrayList;
import java.util.List;

public class Q54_SpiralMatrix {
	 List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> list = new ArrayList<>();
	        if (matrix.length == 0) {
	            return list;
	        }
	        int m = matrix.length, n = matrix[0].length;
	        int minX = 0, maxX = matrix.length - 1, minY = 0, maxY = matrix[0].length - 1;
	        while(list.size() < m * n) {
	            for (int j = minY; j <= maxY; j++) {
	                list.add(matrix[minX][j]);
	            }
	            if (list.size() == m * n) {
	                break;
	            }
	            minX ++;
	            for (int i = minX; i <= maxX; i++) {
	                list.add(matrix[i][maxY]);
	            }
	            if (list.size() == m * n) {
	                break;
	            }
	            maxY --;
	            for (int j = maxY; j >= minY; j--) {
	                list.add(matrix[maxX][j]);
	            }
	            if (list.size() == m * n) {
	                break;
	            }
	            maxX --;
	            for (int i = maxX; i >= minX; i--) {
	                list.add(matrix[i][minY]);
	            }
	            if (list.size() == m * n) {
	                break;
	            }
	            minY ++;
	        }
	        return list;
	    }
}
