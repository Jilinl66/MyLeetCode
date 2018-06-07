package happy2017;
//264. Ugly Number II
public class test264 {
    public int nthUglyNumber(int n) {
    	int[] nums = new int[n];
    	nums[0] = 1;
    	int idx2 = 0, idx3 = 0, idx5 = 0;
    	for(int i = 1; i < n; i++) {
    		int p2 = 2 * nums[idx2];
    		int p3 = 3 * nums[idx3];
    		int p5 = 5 * nums[idx5];
    		int next = Math.min(Math.min(p2, p3), p5);
    		nums[i] = next;
    		if(next == p2) idx2++;
    		if(next == p3) idx3++;
    		if(next == p5) idx5++;
    	}
    	return nums[n - 1];
    }
}
