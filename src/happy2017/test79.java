package happy2017;

//79. Word Search
public class test79 {
	 public boolean exist(char[][] board, String word) {
		 if(word.length() == 0) return false;
		 char[] c_array = word.toCharArray();
		 int row = board.length, col = board[0].length;
		 for(int i = 0; i < row; i++){
			 for(int j = 0; j < col; j++){
				 if(exist(board, i, j, c_array, 0)) return true;
			 }
		 }
		 return false;
	 }
	 
	 public boolean exist(char[][] board, int x, int y, char[] word, int index) {
		int row = board.length, col = board[0].length;
		if(index == word.length) return true;
		if(x < 0 || y < 0 || x == row || y == col) return false;
		if(board[x][y] != word[index]) return false;
		board[x][y] ^= 256;
		boolean ret = exist(board, x + 1, y, word, index + 1)
				|| exist(board, x - 1, y, word, index + 1) 
				|| exist(board, x, y + 1, word, index + 1) 
				|| exist(board, x, y - 1, word, index + 1);
		board[x][y] ^= 256;
		return ret;
	}
//    public boolean exist(char[][] board, String word) {
//    	if(word.length() == 0) return false;
//    	char firstCh = word.charAt(0);
//    	int row = board.length, col = board[0].length;
//    	boolean[][] visited = new boolean[row][col];
//        for(int i = 0; i < row; i++){
//        	for(int j = 0; j < col; j++){
//        		if(board[i][j] == firstCh){
//        			visited[i][j] = true;
//        			if(helper(board, word.substring(1), i, j, visited)){
////        				System.out.println("if" + i + " " + j);
//        				return true;
//        			}
//        			else{
//        				visited[i][j] = false;
//        				System.out.println("else" + i + " " + j);
//        			}
//        		}
//        	}
//        }
//        return false;
//    }
//    
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
