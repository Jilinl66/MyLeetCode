package happy2017;
//289. Game of Life
public class test289 {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		int lives = liveNeighbours(board, m, n, i, j);
        		if(board[i][j] == 1 && lives >= 2 && lives <= 3)
        			board[i][j] = 3;
        		if(board[i][j] == 0 && lives == 3)
        			board[i][j] = 2;
        	}
        }
        for(int i = 0; i < m; i++)
        	for(int j = 0; j < n; j++)
        		board[i][j] >>= 1;
        		
    }
    
    private int liveNeighbours(int[][] board, int m, int n, int i, int j) {
		int live = 0;
		for(int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m -1); x++)
			for(int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++)
				live += board[x][y] & 1;
		live -= board[i][j] & 1;
		return live;
	}
}
