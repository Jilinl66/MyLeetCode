package happy2017;
//221. Maximal Square
public class test221 {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0)
        	return 0;
        int m = matrix.length, n = matrix[0].length, area = 0;
        int[][] newmatrix = new int[m + 1][n + 1];
        for(int i = 0; i < m; i++){
        	for(int j = 0; j <n; j++){
        		if(matrix[i][j] == '1'){
        			newmatrix[i + 1][j + 1] = Math.min(Math.min(newmatrix[i+1][j], newmatrix[i][j]), newmatrix[i][j+1]) + 1;
        			area = Math.max(area, newmatrix[i + 1][j + 1]);
        		}
        	}
        }
        return area * area;
    }
}
