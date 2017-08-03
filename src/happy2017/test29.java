package happy2017;
//29. Divide Two Integers
public class test29 {
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if(dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0)
        	sign = -1;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        if(ldivisor == 0) return Integer.MAX_VALUE;
        if(ldividend == 0 || ldividend < ldivisor) return 0;
        long lans = ldivide(ldividend, ldivisor);
        if(lans > Integer.MAX_VALUE) 
        	return sign == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
        return (int) lans * sign;
    }
    
    //Binary Search
    private long ldivide(long ldividend, long ldivisor) {
		if(ldividend < ldivisor) return 0;
		long sum = ldivisor;
		int multiple = 1;
		while(sum + sum < ldividend){
			sum += sum;
			multiple += multiple;
		}
		return multiple + ldivide(ldividend - sum, ldivisor);
	}
}
