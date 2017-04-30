package happy2017;
//374. Guess Number Higher or Lower Add
public class test374 {
    public int guessNumber(int n) {
        int low = 0, high = n;
        while(low < high){
        	int mid = low + (high - low)/2;
        	int ret = guess(mid);
        	if(ret == 0) return mid;
        	else if(ret == 1)
        		low = mid + 1;
        	else
        		high = mid - 1;
        }
        return low;
    }

	private int guess(int mid) {
		return 0;
	}
}
