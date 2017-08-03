package happy2017;

import java.util.Arrays;

//462. Minimum Moves to Equal Array Elements II
public class test462 {
    public int minMoves2(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int res = 0, i = 0, j = nums.length - 1;
        while(i < j){
        	res += nums[j] - nums[i];
        	i ++;
        	j --;
        }
        return res;
    }
}
