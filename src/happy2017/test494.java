package happy2017;
//494. Target Sum
public class test494 {
	public int findTargetSumWays(int[] nums, int S) {
		int sum = 0;
		for(int i: nums)
			sum += i;
		return sum < S || (S + sum) % 2 != 0? 0: subSetSum(nums, (S + sum) >>> 1);
	}
	
	private int subSetSum(int[] nums, int s) {
		 int[] dp = new int[s + 1];
		 dp[0] = 1;
		 for(int num: nums){
			 for(int i = s; i >= num; i--){
				 dp[i] += dp[i - num];
			 }
		 }
		 return dp[s];
	}
//    int count = 0;
//
//    public int findTargetSumWays(int[] nums, int S) {
//    	if(nums == null || nums.length == 0)
//    		return 0;
//        DFS(nums, S, 0, 0);
//        return count;
//    }
//    
//    private void DFS(int[] nums, int sum, int curSum, int pos){
//    	if(pos == nums.length){
//    		if(curSum == sum)
//    			count ++;
//    		return;
//    	}
//		DFS(nums, sum, curSum + nums[pos], pos + 1);
//		DFS(nums, sum, curSum - nums[pos], pos + 1);
//    }
}
