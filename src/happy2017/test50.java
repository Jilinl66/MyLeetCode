package happy2017;
//50. Pow(x, n)
public class test50 {
    public double myPow(double x, int n) {
    	int flag = 1;
    	long remain = n;
    	if(remain < 0) {
    		flag = -1;
    		remain = -remain;
    	}
    	double res = 1;
    	while(remain > 0) {
    		double mul = x;
    		long idx  = 1;
    		while(idx * 2 <= remain) {
    			idx *= 2;
    			mul = mul*mul;
    		}
    		remain -= idx;
    		res *= mul;
    	}
    	return flag == 1? res: 1/res;
    }
}
