package happy2017;
//330. Patching Array
public class test330 {
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int patched = 0, i = 0;
        while (miss <= n){
        	if(i < nums.length && nums[i] <= miss)
        		miss += nums[i++];
        	else{
        		miss += miss;
        		patched ++;
        	}
        }
        return patched;
    }
}
