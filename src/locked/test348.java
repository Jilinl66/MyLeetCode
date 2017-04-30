package locked;

import java.util.HashMap;

//348. Design Tic-Tac-Toe 
public class test348 {
	HashMap<Integer, int[]> map;
	int[] dirs;
	int n;
    /** Initialize your data structure here. */
    public test348(int n) {
    	map = new HashMap<>();
    	dirs = new int[4];
    	this.n = n;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.                                                                                                                                                                                                                                                                        
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */                                                    
    public int move(int row, int col, int player) {
    	dirs[0] = row;
    	dirs[1] = col + n;
    	dirs[2] = row == col? 2*n : -1;
    	dirs[3] = row + col == n - 1? 2*n + 1: -1;
    	for(int i: dirs){
    		if(i == -1) continue;
    		if(map.get(i) == null)
            	map.put(i, new int[2]);
            if(++map.get(i)[player - 1] == n) 
            	return player;
    	}
        return 0;      	
    }
}
