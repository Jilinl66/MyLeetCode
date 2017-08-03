package happy2017;
//231. Power of Two
public class test231 {
    public boolean isPowerOfTwo(int n) {
    	while(n > 0 && (n & 1) == 0)
    		n >>= 1;
    	return n == 1;
    }
}
