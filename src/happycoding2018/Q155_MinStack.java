package happycoding2018;

import java.util.Stack;

public class Q155_MinStack {
	int min = Integer.MAX_VALUE;
    Stack<Integer> stack;
    
    /** initialize your data structure here. */
    public Q155_MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }            
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
