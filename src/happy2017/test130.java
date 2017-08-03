package happy2017;
//130. Surrounded Regions
public class test130 {
	int m, n;
	public void solve(char[][] board) {
		if(board.length == 0) return;
		m = board.length;
		n = board[0].length;
		if(m <= 1 || n <= 1) return;
		for(int i = 0; i < m; i++) {
			if(board[i][0] == 'O')
				boundaryDFS(board, i, 0);
			if(board[i][n - 1] == 'O')
				boundaryDFS(board, i, n - 1);
		}
		for(int j = 0; j < n; j++) {
			if(board[0][j] == 'O')
				boundaryDFS(board, 0, j);
			if(board[m - 1][j] == 'O')
				boundaryDFS(board, m - 1, j);
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 'O')
					board[i][j] = 'X';
				else if(board[i][j] == '*')
					board[i][j] = 'O';
			}
		}
	}

    private void boundaryDFS(char[][] board, int i, int j) {
    	board[i][j] = '*';
    	if (i > 1 && board[i-1][j] == 'O')
    		boundaryDFS(board, i-1, j);
    	if (i < board.length - 2 && board[i+1][j] == 'O')
    		boundaryDFS(board, i+1, j);
    	if (j > 1 && board[i][j-1] == 'O')
    		boundaryDFS(board, i, j-1);
    	if (j < board[i].length - 2 && board[i][j+1] == 'O')
    		boundaryDFS(board, i, j+1);
    }
    
//stack overflow ?
//	private void boundaryDFS(char[][] board, int i, int j) {
//	if(i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') 
//	    return;
//	board[i][j] = '*';
//	boundaryDFS(board, i - 1, j);
//	boundaryDFS(board, i + 1, j);
//	boundaryDFS(board, i, j - 1);
//	boundaryDFS(board, i, j + 1);
//}
}
