package happy2017;

//137. Single Number II
public class test137 {
    public int singleNumber(int[] nums) {
    	int res = 0;
    	for(int i = 0; i < 32; i++) {
    		int sum = 0;
    		for(int num: nums) {
    			if(((num >> i) & 1) == 1)
    				sum += 1;
    		}
    		if(sum % 3 == 1)
    			res |= (1 << i);
    	}
    	return res;
    }
}
