package happy2017;
//136. Single Number
public class test136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
        	res ^= nums[i];
        }
        return res;
    }
}
