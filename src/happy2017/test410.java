package happy2017;
//410. Split Array Largest Sum
public class test410 {
    public int splitArray(int[] nums, int m) {
        long sum = 0;
        int max = 0;
        for(int num: nums){
        	max = Math.max(max, num);
        	sum += num;
        }
        if(m == 1) return (int)sum;
        long left = max, right = sum;
        while(left <= right){
        	long mid = (left + right) /2;
        	if (valid(mid, nums, m))
        		right = mid - 1;
        	else
        		left = mid + 1;
        		
        }
        return (int)left;
    }
    
    private boolean valid(long target, int[] nums, int m) {
		int count = 1;
		long total = 0;
		for(int num: nums){
			total += num;
			if(total > target){
				total = num;
				count++;
				if(count > m)
					return false;
			}
		}
		return true;
	}
}
