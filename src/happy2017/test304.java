package happy2017;
//304. Range Sum Query 2D - Immutable
public class test304 {
	int[][] matrix;
    public test304(int[][] matrix) {
        this.matrix = matrix;
        if(matrix.length != 0){
            int m = matrix.length;
	        int n = matrix[0].length;
	        for(int i = 0; i < m; i++){
	        	for(int j = 0; j < n; j++){
	        		if(i== 0 && j == 0) continue;
	        		if(j == 0) matrix[i][j] += matrix[i - 1][j];
	        		else if(i == 0) matrix[i][j] += matrix[i][j - 1];
	        		else matrix[i][j] += matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1];
	        	}
	        }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    	int sum = matrix[row2][col2];
    	if(row1 == 0 && col1 == 0) return sum;
        if(col1 == 0)  return sum - matrix[row1 - 1][col2];
        else if(row1 == 0) return sum - matrix[row2][col1 - 1];
        else return sum - matrix[row1 - 1][col2] - matrix[row2][col1 - 1] + matrix[row1 - 1][col1 - 1];
    }
}
