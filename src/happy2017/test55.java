package happy2017;
//55. Jump Game
public class test55 {
	public boolean canJump(int[] nums) {
		int max = 0;
		for(int i = 0; i < nums.length; i++){
			if(i > max) return false;
			max = Math.max(max, i + nums[i]);
		}
		return true;
	}
}
//    public boolean canJump(int[] nums) {
//    	int len = nums.length;
//    	if(len == 1 || len == 0) return true;
//        int[] reach = new int[len];
//        reach[0] = 1;
//        for(int i = 0; i < len; i++){
//        	if(reach[i] == 1){
//        		for(int j = 1; j <=nums[i]; j++){
//        			if(i + j == len - 1) return true;
//        			reach[i + j] = 1;
//        		}
//        	}
//        }
//        return false;
//    }

