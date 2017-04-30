package happy2017;
//50. Pow(x, n)
public class test50 {
    public double myPow(double x, int n) {
    	if(n == 0) return 1;
    	if(n < 0){
    		n *= -(n + 1);
    		x = 1/x;
    	}
    	if(n%2 == 0) return myPow(x*x, n/2);
    	else return x*myPow(x*x, n/2);
    }
    
//    public double myPow(double x, int n) {
//    	if(n == 0) return 1;
//    	if(n < 0){
//    		n = -n;
//    		x = 1/x;
//    	}
//    	if(n == 1) return x;
//        int i = 1;
//        double res = x;
//        while(i*2 <= n){
//        	i *=2;
//        	res *=res;
//        }
//        return res * myPow(x, n - i);
//    }
}
