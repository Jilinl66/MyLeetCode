package happy2017;
// 334. Increasing Triplet Subsequence

public class test334 {
    public boolean increasingTriplet(int[] nums) {
    	int small = Integer.MAX_VALUE, large = Integer.MAX_VALUE;
    	for(int num: nums) {
    		if(num <= small)
    			small = num;
    		else if(num <= large)
    			large = num;
    		else
    			return true;
    	}
    	return false;
    }
}
