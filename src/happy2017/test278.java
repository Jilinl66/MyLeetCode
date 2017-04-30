package happy2017;
//278. First Bad Version
public class test278 {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low < high){
        	int mid = (low  + high) /2;
        	if(isBadVersion(mid)) high = mid;
        	else low = mid + 1;
        }
        return low;
    }

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
