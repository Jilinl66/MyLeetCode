package happy2017;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

//150. Evaluate Reverse Polish Notation 
public class test150 {
    public int evalRPN(String[] tokens) {
    	if(tokens.length == 0) return 0;
    	Stack<Integer> stack = new  Stack<>();
    	Set<String> Operator = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        for(int i = 0; i < tokens.length; i++){
        	String curStr = tokens[i];
        	if(!Operator.contains(curStr)){
        		stack.push(Integer.parseInt(curStr));
        		continue;
        	}
        	int num1 = stack.pop();
        	int num2 = stack.pop();
        	switch (curStr) {
			case "+":
				stack.push(num2 + num1);
				break;
			case "-":
				stack.push(num2 - num1);
				break;
			case "*":
				stack.push(num2 * num1);
				break;
			case "/":
				stack.push(num2 / num1);
				break;
			default:
				break;
			}
        }
        return stack.pop();
    }
}
