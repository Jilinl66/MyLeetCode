package happy2017;
//372. Super Pow
public class test372 {
    public int superPow(int a, int[] b) {
        if(a % 1337 == 0) return 0;
        int p = 0;
        for(int i: b)
        	p = (10 * p + i) % 1140;
        if(p == 0) p += 1140;
        return power(a, p, 1337);
    }
    
    private int power(int a, int n, int mod){
    	a = a % mod;
    	int ret = 1;
    	while(n != 0){
    		if((n & 1) != 0)
    			ret = ret * a % mod;
    		a = a * a % mod;
    		n >>= 1;
    	}
    	return ret;
    }
}
