package happy2017;

//384. Shuffle an Array
public class test384 {
	private int[] nums;
    public test384(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null)
        	return null;
        int[] rand = nums.clone();
        for(int i = 1; i < nums.length; i++){
        	int index = (int) Math.floor(Math.random() * nums.length);
        	swap(rand, index, i);
        }
        return rand;
    }
    
    public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
