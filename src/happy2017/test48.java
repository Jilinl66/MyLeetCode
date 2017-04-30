package happy2017;
//48. Rotate Image
public class test48 {
    public void rotate(int[][] matrix) {
    	int n = matrix.length;
        for(int r = 0; r < n / 2; r ++)
        	for(int c = 0; c < n; c ++)
        		swap(matrix, r, c, n - 1 - r, c);
        for(int r = 0; r < n; r++)
        	for(int c = r + 1; c < n; c++)
        		swap(matrix, r, c, c, r);
    }
    
    private void swap(int[][] matrix, int a, int b, int c, int d) {
		int temp = matrix[a][b];
		matrix[a][b] = matrix[c][d];
		matrix[c][d] = temp;
	}
}
