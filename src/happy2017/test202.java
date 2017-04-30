package happy2017;

import java.util.HashSet;
import java.util.Set;

//202. Happy Number
public class test202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n != 1){
        	n = sumOfSquares(n);
        	if(!set.add(n))
        		return false;	
        }
        return true;
    }
    
    private int sumOfSquares(int n) {
    	int sum = 0;
		while(n != 0){
			sum += Math.pow(n % 10, 2);
			n/= 10;
		}
		return sum;
	}
}
