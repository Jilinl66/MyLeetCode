package happy2017;
//307. Range Sum Query - Mutable
public class test307 {
	int[] nums;
	int[] BIT;
	int len;
    public test307(int[] nums) {
    	this.nums = nums;
    	len = nums.length;
    	BIT = new int[len + 1];
    	for(int i = 0; i < len; i++)
    		init(i, this.nums[i]);
    }
    
    private void init(int i, int val) {
		i++;
		while(i <= len){
			BIT[i] += val;
			i += (i & -i);
		}
	}

	public void update(int i, int val) {
		int diff = val - nums[i];
		nums[i] = val;
		init(i, diff);
	}
    
	public int getSum(int i) {
		int sum = 0;
		i++;
		while(i > 0){
			sum += BIT[i];
			i -= (i & -i);
		}
		return sum;
	}
	
    public int sumRange(int i, int j) {
    	return getSum(j) - getSum(i - 1);
    }
}
