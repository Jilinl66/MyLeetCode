package happy2017;
//400. Nth Digit
public class test400 {
    public int findNthDigit(int n) {
    	int len = 1;
    	while(n > (Math.pow(10, len) - Math.pow(10, len - 1)) * len){
    		n -= (Math.pow(10, len) - Math.pow(10, len - 1)) * len;
    		len++;
    	}
    	int target = (int) Math.pow(10, len - 1) + (n-1)/len;
    	int index = (n - 1) % len; 
    	return String.valueOf(target).charAt(index) - '0';
    }
}
