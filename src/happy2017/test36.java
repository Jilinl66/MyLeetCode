package happy2017;

import java.util.HashSet;

//36. Valid Sudoku
public class test36 {
    public boolean isValidSudoku(char[][] board) {
    	HashSet<Character> row = new HashSet<>();
    	HashSet<Character> col = new HashSet<>();
    	HashSet<Character> cub = new HashSet<>();
    	for(int i = 0; i < 9; i++){
    		row.clear();
    		col.clear();
    		cub.clear();
    		for(int j = 0; j < 9; j++){
    			if(board[i][j] != '.' && !row.add(board[i][j])) return false;
    			if(board[j][i] != '.' && !col.add(board[j][i])) return false;
    			int r = 3 * (i/3);
    			int c = 3 * (i%3);
    			if(board[r + j/3][c + j%3] != '.' && !cub.add(board[r + j/3][c + j%3])) return false;
    		}
    	}
    	return true;
    }
}
