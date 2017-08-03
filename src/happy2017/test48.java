package happy2017;
//48. Rotate Image
public class test48 {
    public void rotate(int[][] matrix) {
    	if(matrix == null || matrix.length == 0) return;
    	int n = matrix.length;
    	for(int i = 0; i < n/2; i++) {
    		for(int j = 0; j < n; j++) {
    			reverse(matrix, i, j, n - 1 - i, j);
    		}
    	}
    	for(int i = 0; i < n; i++) {
    		for(int j = i + 1; j < n; j++) {
    			reverse(matrix, i, j, j, i);
    		}
    	}
    }
    
    private void reverse(int[][] matrix, int x1, int y1, int x2, int y2) {
    	int temp = matrix[x1][y1];
    	matrix[x1][y1] = matrix[x2][y2];
    	matrix[x2][y2] = temp;
    }
}

/**  Amazon Microsoft Apple
 * 
 */
