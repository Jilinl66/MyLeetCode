package happy2017;
//231. Power of Two
public class test231 {
    public boolean isPowerOfTwo(int n) {
        while (n != 1) {
			if(n != 0 && n % 2 == 0)
				n = n/2;
			else
				return false;
		}
        return true;
    }
}
