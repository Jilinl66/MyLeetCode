package happy2017;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//496. Next Greater Element I
public class test496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    	Stack<Integer> stack = new Stack<>();
    	for(int num: nums){
    		while(!stack.isEmpty() && stack.peek() < num)
    			map.put(stack.pop(), num);
    		stack.push(num);
    	}
    	while(!stack.isEmpty())
    		map.put(stack.pop(), -1);
    	int[] res = new int[findNums.length];
    	for(int i = 0; i < findNums.length; i++){
    		res[i] = map.get(findNums[i]);
    	}
    	return res;
    }
}
