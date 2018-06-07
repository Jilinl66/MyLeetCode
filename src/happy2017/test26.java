package happy2017;

//26. Remove Duplicates from Sorted Array
public class test26 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
        	nums[count] = nums[i];
			count ++;
			i++;
			while(i < nums.length && nums[i] == nums[i - 1])
				i++;
			i--;
		}
        return count;
    }
}
