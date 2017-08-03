package happy2017;

import java.util.Arrays;
import java.util.Stack;

//503. Next Greater Element II
public class test503 {
	public int[] nextGreaterElements(int[] nums) {
		int[] res = new int[nums.length];
		Arrays.fill(res, -1);
		int len = nums.length;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < len * 2; i++){
			while(!stack.isEmpty() && nums[i % len] > nums[stack.peek()])
    			res[stack.pop()] = nums[i % len];
			stack.push(i % len);
		}
		return res;
	}

//    public int[] nextGreaterElements(int[] nums) {
//        int[] res = new int[nums.length];
//        Arrays.fill(res, Integer.MAX_VALUE);
//        int len = nums.length;
//        int max = Integer.MIN_VALUE;
//        int count = 0;
//        for(int i = 0; i < len; i++)
//        	max = Math.max(max, nums[i]);
//        for(int i = 0; i < len; i++){
//        	if(nums[i] == max){
//        		count ++;
//        		res[i] = -1;
//        	}
//        }
//        int i = 0;
//        Stack<Integer> stack = new Stack<>();
//        while(count < len){
//    		while(!stack.isEmpty() && nums[i % len] > nums[stack.peek()]){
//    			int index = stack.pop();
//    			if(res[index] == Integer.MAX_VALUE){
//    				res[index] = nums[i % len];
//    				count ++;
//    			}
//    		}
//    		stack.push(i);
//    		i = (i + 1) % len;
//        }
//    	return res;
//    }
}
