package happy2017;
//278. First Bad Version
public class test278 {
    public int firstBadVersion(int n) {
    	int lo = 1, hi = n;
    	while(lo < hi) {
    		int mid = lo + (hi - lo)/2;
    		if(isBadVersion(mid))
    			hi = mid;
    		else
    			lo = mid + 1;
    	}
    	return lo;
    }

	private boolean isBadVersion(int mid) {
		return false;
	}
}
