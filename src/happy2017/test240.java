package happy2017;
//Search a 2D Matrix II
public class test240 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length == 0) return false;
    	int m = matrix.length, n = matrix[0].length;
    	int i = 0, j = n - 1;
    	while(i < m && j >= 0) {
    		if(matrix[i][j] == target) return true;
    		if(matrix[i][j] < target) i++;
    		else j--;
    	}
    	return false;
    }
}
