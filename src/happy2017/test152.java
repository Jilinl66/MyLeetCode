package happy2017;
//152. Maximum Product Subarray
public class test152 {
    public int maxProduct(int[] nums) {
        if(nums.length == 0)
        	return 0;
        int maxpre = nums[0];
        int minpre = nums[0];
        int maxcur, mincur;
        int Max = nums[0];
        for(int i = 1; i < nums.length; i++){
        	maxcur = Math.max(Math.max(maxpre * nums[i], minpre * nums[i]), nums[i]);
        	mincur = Math.min(Math.min(maxpre * nums[i], minpre * nums[i]), nums[i]);
        	Max = Math.max(maxcur, Max);
        	maxpre = maxcur;
        	minpre = mincur;
        }
        return Max;
    }
}
