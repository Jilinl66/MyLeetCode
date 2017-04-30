package newToLeetcode;
//Search a 2D Matrix II
public class test240 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length== 0)
    		return false;
    	int i = 0, j = matrix[0].length - 1;
    	//pay attention to index over bound
    	while(i< matrix.length && j >= 0 && matrix[i][j] != target){
    		if(target < matrix[i][j])
    			j = j - 1;
    		else i = i + 1;
    	}
    	if(i< matrix.length && j >= 0)
    		return true;
    	else return false;
    }
}
