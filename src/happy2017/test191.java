package happy2017;
//191. Number of 1 Bits
public class test191 {
    public int hammingWeight(int n) {
    	int count = 0;
    	while(n!= 0){
    		count += (n & 1);
    		n = n >>> 1;
    	}
    	return count;
    }
}
