package locked;

//487. Max Consecutive Ones II
public class test487 {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int max = 0;
    	boolean seenZero = false;
    	int zeroIndex = 0;
    	int low = 0;
        for (int high = 0; high < nums.length; high ++) {
			if(nums[high] == 0) {
				if(!seenZero)
					seenZero = true;
				else
					low = zeroIndex + 1;
				zeroIndex = high;
			}
			max = Math.max(max, high - low + 1);
		}
        return max;
    }
}

// See zero for second, third time, don't change flage to false