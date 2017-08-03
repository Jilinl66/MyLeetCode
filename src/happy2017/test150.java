package happy2017;

import java.util.Stack;

//150. Evaluate Reverse Polish Notation 
public class test150 {
    public int evalRPN(String[] tokens) {
    	if(tokens.length == 0) {
    		System.out.println("return");
    		return 0;
    	}
    	Stack<Integer> stack = new Stack<>();
    	for(String t: tokens) {
    		if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
	    		int b = stack.pop();
	    		int a = stack.pop();
	    		switch (t) {
				case "+":
					stack.push(a + b);
					break;
				case "-":
					stack.push(a - b);
					break;
				case "*":
					stack.push(a * b);
					break;
				case "/":
					stack.push(a/b);
					break;
				default:
					break;
				} 
    		}
    		else stack.push(Integer.valueOf(t));
    	}
    	return stack.peek();
    }
}

/** LinkedIn
 * 
 */
