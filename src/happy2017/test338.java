package happy2017;
//338. Counting Bits
public class test338 {
    public int[] countBits(int num) {
    	if(num < 0) return new int[0];
        int[] res = new int[num + 1];
        res[0] = 0;
        int power = 0;
        for(int i = 1; i <= num; i++){
        	if(i == (1 << power)){
        		res[i] = 1;
        		power ++;
        	}
        	else
        		res[i] = 1 + res[i - (1 << (power - 1))];
        }
        return res;
    }
}
