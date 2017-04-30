package happy2017;
//59. Spiral Matrix II
public class test59 {
    public int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int i = 1;
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;
        while(rowStart <= rowEnd && colStart <= colEnd){
        	for(int col = colStart; col <= colEnd; col ++)
            	spiralMatrix[rowStart][col] = i++;
            rowStart ++;
            for(int row = rowStart; row <= rowEnd; row++)
            	spiralMatrix[row][colEnd] = i++;
            colEnd --;
            for(int col = colEnd; col >= colStart; col--)
            	spiralMatrix[rowEnd][col] = i++;
            rowEnd --;
            for(int row = rowEnd; row >= rowStart; row--)
            	spiralMatrix[row][colStart] = i++;
            colStart ++;
        }
        return spiralMatrix;
    }
}
