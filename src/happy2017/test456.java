package happy2017;

import java.util.Stack;

//456. 132 Pattern
public class test456 {
	public boolean find132pattern(int[] nums) {
		class Interval {
			int min;
			int max;
			public Interval(int min, int max) {
				this.min = min;
				this.max = max;
			}
		}
		Stack<Interval> stack = new Stack<>();
		for(int i = 0; i < nums.length; i++){
			if(stack.isEmpty() || nums[i] < stack.peek().min)
				stack.push(new Interval(nums[i], nums[i]));
			else if(nums[i] > stack.peek().min){
				Interval top = stack.pop();
				if(nums[i] < top.max) return true;
				else{
					top.max = nums[i];
					while(!stack.isEmpty() && nums[i] > stack.peek().max) stack.pop();
					if(!stack.isEmpty() && nums[i] > stack.peek().min) return true;
					stack.push(top);
				}
			}
		}
		return false;
	}
//    public boolean find132pattern(int[] nums) {
//    	int min = Integer.MAX_VALUE;
//    	for (int j = 0; j < nums.length; j++) {
//    		min = Math.min(min, nums[j]);
//    		if(min == nums[j]) continue;
//    		for(int k = nums.length - 1; k > j; k--)
//    			if(nums[k] < nums[j] && nums[k] > nums[min]) return true;
//    	}
//    	return false;
//    }
}