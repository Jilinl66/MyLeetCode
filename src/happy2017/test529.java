package happy2017;
//529. Minesweeper
public class test529 {	
    public char[][] updateBoard(char[][] board, int[] click) { 
        if(board.length == 0 || board[0].length == 0) return board;
        int m = board.length, n = board[0].length;
        int[][] dirs = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};  
        int row = click[0], col = click[1];
        if(board[row][col] == 'M'){
        	board[row][col] = 'X';
        	return board;
        }
    	int count = 0;
        for(int[] d: dirs){
        	int r = row + d[0];
        	int c = col + d[1];
        	if(r < 0 || r >= m || c < 0 || c >= n) continue;
        	if(board[r][c] == 'M' || board[r][c] == 'X')
        		count ++;
        }
        if(count > 0){
        	board[row][col] = (char) (count + '0');
        }
        else{
        	board[row][col] = 'B';
        	for(int[] d: dirs){
            	int r = row + d[0];
            	int c = col + d[1];
            	if(r < 0 || r >= m || c < 0 || c >= n) continue;
            	if(board[r][c] == 'E')
            		updateBoard(board, new int[]{r, c});
        	}
        }
		return board;
    }
}
