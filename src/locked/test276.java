package locked;
//276. Paint Fence
public class test276 {
    public int numWays(int n, int k) {
    	int[] count = new int[n];
    	if(n == 0) return 0;
    	if(n == 1) return k;
    	int diffCount = k*(k - 1);
    	int sameCount = k;
    	count[0] = k;
        for (int i = 2; i < n; i++) {
        	int temp = diffCount;
        	diffCount = (diffCount + sameCount) * (k - 1);
        	sameCount = temp;
		}
        return diffCount + sameCount;
    }
}
