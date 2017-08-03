package happy2017;
//167. Two Sum II - Input array is sorted
public class test167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if(numbers == null || numbers.length < 2)
        	return res;
        int left = 0, right = numbers.length - 1;
        while(left < right){
        	int sum = numbers[left] + numbers[right];
        	if(sum == target){
        		res[0] = left;
        		res[1] = right;
        		break;
        	}
        	else if(sum > target){
        		right --;
        	}
        	else {
				left ++;
			}
        }
        return res;
    }
}
