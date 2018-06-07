package happy2017;

//80. Remove Duplicates from Sorted Array II
public class test80 {
    public int removeDuplicates(int[] nums) {
    	int count = 0;
    	boolean twice = false;
    	for (int i = 0; i < nums.length; i++) {
			nums[count] = nums[i];
			count++;
			i++;
			while(i < nums.length && nums[i] == nums[i - 1]) {
				if(!twice) {
					nums[count] = nums[i];
					count++;
					twice = true;
				}
				i++;
			}
			twice = false;
			i--;
		}
    	return count;
    }
}
