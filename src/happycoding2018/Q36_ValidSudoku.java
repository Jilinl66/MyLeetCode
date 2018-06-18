package happycoding2018;

public class Q36_ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        boolean[][] colFlag = new boolean[9][9];
        boolean[][] boxFlag = new boolean[9][9];
        for (int row = 0; row < 9; row ++) {
            boolean[] rowFlag = new boolean[9];
            for (int col = 0; col < 9; col ++) {
                if (board[row][col] == '.') {
                    continue;
                }
                int index = board[row][col] - '1';
                int boxNum = 3 * (row/3) + col / 3;
                if (rowFlag[index] || colFlag[col][index] || boxFlag[boxNum][index]) {
                    return false;
                }
                rowFlag[index] = true;
                colFlag[col][index] = true;
                boxFlag[boxNum][index] = true;
            }
        }
        return true;
    }
}
