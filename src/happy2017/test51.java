package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//51. N-Queens
public class test51 {
    public List<List<String>> solveNQueens(int n) {
    	List<List<String>> res = new ArrayList<>();
    	helper(res, new String[n], n, 0, new boolean[n], new boolean[2*n], new boolean[2*n]);
    	return res;
    }
    
    private void helper(List<List<String>> res, String[] board, int n, int r, boolean[] cols, boolean[] d1, boolean[] d2) {
    	if(r == n) {
    		res.add(Arrays.asList(board.clone()));
    		return;
    	}
		for(int c = 0; c < n; c++) {
    		int idx1 =  r - c + n, idx2 = r + c + 1;
			if(!cols[c] && !d1[idx1] && !d2[idx2]) {
				char[] arr = new char[n];
				Arrays.fill(arr, '.');
				arr[c] = 'Q';
				board[r] = new String(arr);
				cols[c] = true; d1[idx1] = true; d2[idx2] = true;
				helper(res, board, n, r + 1, cols, d1, d2);
				cols[c] = false; d1[idx1] = false; d2[idx2] = false;
			}
		}
    }
}
