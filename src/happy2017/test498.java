package happy2017;
//498. Diagonal Traverse
public class test498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int[] res = new int[m * n];
        int[][] dirs = {{-1, 1}, {1, -1}};
        int row = 0, col = 0, diag = 0;
        for(int i = 0; i < m * n; i++){
        	res[i] = matrix[row][col];
        	row += dirs[diag][0];
        	col += dirs[diag][1];      	
        	if(col >= n){
        		col = n - 1;
        		row += 2;
        		diag = 1- diag;
        	}
        	if(row >= m){
        		row = m -1;
        		col += 2;
        		diag = 1 - diag;
        	}
        	if(row < 0){
        		row = 0;
        		diag = 1 - diag;
        	}
        	if(col < 0){
        		col = 0;
        		diag = 1 - diag;
        	}
        }
        return res;
    }
}
