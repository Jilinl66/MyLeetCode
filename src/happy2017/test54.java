package happy2017;

import java.util.ArrayList;
import java.util.List;

//54. Spiral Matrix
public class test54 {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res = new ArrayList<>();
    	if(matrix == null || matrix.length == 0) return res;
    	int m = matrix.length, n = matrix[0].length;
    	int r1 = 0, r2 = m - 1, c1 = 0, c2 = n - 1;
    	while(r1  <= r2 && c1 <= c2) {
    		for(int col = c1; col <= c2; col++)
    			res.add(matrix[r1][col]);
    		r1 ++;
    		for(int row = r1; row <= r2; row++)
    			res.add(matrix[row][c2]);
    		c2--;
    		if(r1 <= r2) {
	    		for(int col = c2; col >= c1; col--)
	    			res.add(matrix[r2][col]);
	    		r2--;
    		}
    		if(c1 <= c2) {
	    		for(int row = r2; row >= r1; row --)
	    			res.add(matrix[row][c1]);
	    		c1++;
    		}
    	}
    	return res;
    }
}

/**  Microsoft Google Uber
 * 
 */
