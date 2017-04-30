package happy2017;

import java.util.Stack;

//224. Basic Calculator
public class test224 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        int number = 0;
        int sign = 1;
        for(int i = 0; i < s.length(); i++){
        	char ch = s.charAt(i);
        	if(Character.isDigit(ch)){
        		number = 10 * number + (ch - '0');
        	}
        	else if(ch == '+'){
        		result += sign * number;
        		number = 0;
        		sign = 1;
        	}
        	else if(ch == '-'){
        		result += sign * number;
        		number = 0;
        		sign = -1;
        	}
        	else if(ch == '('){
        		stack.push(result);
        		stack.push(sign);
        		sign = 1;
        		result = 0;
        	}
        	else if(ch == ')'){
        		result += sign * number;
        		number = 0;
        		result *= stack.pop();
        		result += stack.pop();
        	}
        }
        if(number != 0)
        	result += sign * number;
        return result;
    }
}
