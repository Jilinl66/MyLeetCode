package happy2017;
//279. Perfect Squares
public class test279 {
    public int numSquares(int n) {
        int[] square = new int[n + 1];
        square[0] = 0;
        for(int i = 1; i <= n; i++){
            	int min = Integer.MAX_VALUE;
            	int j = 1;
            	while(i - j*j >= 0){
            		min = Math.min(min, square[i - j*j] + 1);
            		j++;
            	}
            	square[i] = min;
        }
        return square[n];
    }
}
