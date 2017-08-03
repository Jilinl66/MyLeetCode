package happy2017;

//79. Word Search
public class test79 {
	public boolean exist(char[][] board, String word) {
		if(board.length == 0) return false;
		int m = board.length, n = board[0].length;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(exist(board, word, i, j, 0))
					return true;
			}
		}
		return false;
	}
	
	private boolean exist(char[][] board, String word, int i, int j, int pos) {
		if(pos == word.length()) return true;
		if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(pos) != board[i][j]) return false;
		board[i][j] ^= 256;
		boolean ret = exist(board, word, i + 1, j, pos + 1) ||
					exist(board, word, i - 1, j, pos + 1) ||
					exist(board, word, i, j + 1, pos + 1) ||
					exist(board, word, i, j - 1, pos + 1);
		board[i][j] ^= 256;
		return ret;
	}
	  
//    public boolean helper(char[][] b, String word, int x, int y, boolean[][] v) {
//    	int row = b.length, col = b[0].length;
//		if(word.length() == 0) return true;
//		char cur = word.charAt(0);
//		System.out.println("x: " + x + "y: " + y + "cur: " + cur);
//		boolean r1 = false, r2 = false, r3 = false, r4 = false;
//		boolean[][] v1  = v, v2 = v, v3 = v, v4 = v;
//		String remainString = (word.length() == 1 ? "": word.substring(1));
//		if(x - 1 >= 0 && !v1[x - 1][y] && b[x - 1][y] == cur){
//			System.out.println("r1");
//			v1[x - 1][y] = true;
//			r1 =  helper(b, remainString, x - 1, y, v1);
//		}
//		if(x + 1 < row && !v2[x + 1][y] && b[x + 1][y] == cur){
//			System.out.println("r2");
//			v2[x + 1][y] = true;
//			System.out.println(remainString);
//			r2 = helper(b, remainString, x + 1, y, v2);
//		}	
//		if(y - 1 >= 0 && !v3[x][y - 1] && b[x][y - 1] == cur){
//			System.out.println("r3");
//			v3[x][y - 1] = true;
//			System.out.println(remainString);
//  			r3 = helper(b, remainString, x, y - 1, v3);
//		}			
//		if(y + 1 < col && !v4[x][y + 1] && b[x][y + 1] == cur){
//			System.out.println("r4");
//			v4[x][y + 1] = true;
//			System.out.println(remainString);
//			r4 = helper(b, remainString, x, y + 1, v4);
//		}
//		return r1 || r2 || r3 || r4;
//	}
}
