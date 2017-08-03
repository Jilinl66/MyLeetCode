package happy2017;
//453. Minimum Moves to Equal Array Elements
public class test453 {
    public int minMoves(int[] nums) {
    	if(nums.length == 0) return 0;
    	int min = Integer.MAX_VALUE;
    	int res = 0;
    	for(int num : nums)
    		if(num < min) min = num;
    	for(int num: nums)
    		res += (num - min);
    	return res;
    }
}
