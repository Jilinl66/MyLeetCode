package locked;

//360. Sort Transformed Array
public class test360 {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
    	int len = nums.length;
    	int[] func = new int[len];
    	for(int i = 0; i < len; i++)
    		func[i] = a * nums[i] * nums[i] + b * nums[i] + c;
    	int[] sorted = new int[len];
        int i = 0, j = len - 1;
        int index = a > 0 ? len - 1: 0;
        while(i <= j) {
        	if(a >= 0) 
        		sorted[index--] = func[i] > func[j]? func[i++]: func[j--];
        	else
        		sorted[index++] = func[i] < func[j]? func[i++]: func[j--];
        }
        return sorted;
    }
}

//Start two end is beter than starting from the middle