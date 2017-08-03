package happy2017;


//367. Valid Perfect Square
public class test367 {
    public boolean isPerfectSquare(int num) {
    	int len = String.valueOf(num).length();
    	long lower = (int) Math.pow(10, (len - 1)/2), upper = (int) Math.pow(10, (len - 1)/2 + 1);
    	while(lower <= upper){
    		long mid = (lower + upper) /2;
    		long square = mid * mid;
    		if(square == num) return true;
    		if(square < num)
    			lower = mid + 1;
    		else
    			upper = mid - 1;
    	}
    	return false;
    }
}
