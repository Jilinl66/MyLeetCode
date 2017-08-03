package happy2017;
//326. Power of Three
public class test326 {
    public boolean isPowerOfThree(int n) {
    	int maxPow = (int) (Math.log(Integer.MAX_VALUE)/Math.log(3.0));
    	return n > 0 && Math.pow(3.0, maxPow) % n == 0; 
    }
}
