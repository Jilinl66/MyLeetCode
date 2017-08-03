package happy2017;
//375. Guess Number Higher or Lower II
public class test375 {
    public int getMoneyAmount(int n) {
    	int[][] table = new int[n + 1][n + 1];
    	return DP(table, 1, n);
    }
    private int DP(int[][] table, int start, int end) {
		if(start >= end) return 0;
		if(table[start][end] != 0) return table[start][end];
		int res = Integer.MAX_VALUE;
		for(int i = start; i <= end; i++){
			int temp = i + Math.max(DP(table, start, i - 1), DP(table, i + 1, end));
			res = Math.min(res, temp);
		}
		table[start][end] = res;
		return res;
	}
}
