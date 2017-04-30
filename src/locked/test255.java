package locked;

import java.util.Stack;

//255. Verify Preorder Sequence in Binary Search Tree
public class test255 {
    public boolean verifyPreorder(int[] preorder) {
        int low = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int val: preorder) {
        	if(stack.isEmpty() || val < stack.peek()) 
        		if(val < low) return false; 
        	while(!stack.isEmpty() && stack.peek() < val)
        		low = stack.pop();
        	stack.push(val);
        }
    	return true;
    }
}

//Zenefits
