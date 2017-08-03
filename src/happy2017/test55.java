package happy2017;
//55. Jump Game
public class test55 {
	public boolean canJump(int[] nums) {
		if(nums.length < 2) return true;
		int max = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			if(i <= max)
				max = Math.max(max, i + nums[i]);
			else
				return false;
		}
		return true;
		
	}
}

