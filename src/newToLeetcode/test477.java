package newToLeetcode;
//477. Total Hamming Distance
public class test477 {
    public int totalHammingDistance(int[] nums) {
        int count = 0, n = nums.length;
        for(int j = 0; j < 32; j++){
        	int bitCount = 0;
        	for(int i = 0; i < n; i++)
        		bitCount += (nums[i] >> j) & 1;
        	count = count + bitCount*(n-bitCount);
        }
        return count;
    }
}
