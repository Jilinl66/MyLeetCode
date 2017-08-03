package happy2017;
//419. Battleships in a Board
public class test419 {
    public int countBattleships(char[][] board) {
    	if(board == null || board.length == 0) return 0;
    	int count = 0;
    	for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j] == '.') continue;
				if((i - 1 >= 0 && board[i - 1][j] == 'X') || (j - 1 >=0 && board[i][j - 1] == 'X')) continue;
				count ++;
			}
		}
    	return count;
    } 
}

/** Microsoft
 */