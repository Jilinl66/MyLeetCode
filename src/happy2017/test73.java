package happy2017;
//73. Set Matrix Zeroes
public class test73 {
    public void setZeroes(int[][] matrix) {
    	int[] rowsF = new int[matrix.length];
    	int[] colsF = new int[matrix[0].length];
        for(int i = 0; i < rowsF.length; i++)
        	for(int j = 0; j < colsF.length; j++)
        		if(matrix[i][j] == 0){
        			if(colsF[j] == 0)
        				colsF[j] = 1;
        			if(rowsF[i] == 0)
        				rowsF[i] = 1;
        		}
        for(int i = 0; i < rowsF.length; i++)
        	if(rowsF[i] == 1)
        		for(int j = 0; j < colsF.length; j++)
        			matrix[i][j] = 0;
        for(int j = 0; j < colsF.length; j++)
        	if(colsF[j] == 1)
        		for(int i = 0; i < rowsF.length; i++)
        			matrix[i][j] = 0;
    }
}
