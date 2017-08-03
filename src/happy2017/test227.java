package happy2017;

import java.util.Stack;

//227. Basic Calculator II
public class test227 {
    public int calculate(String s) {
    	if(s == null || s.length() == 0)
    		return 0;
    	Stack<Integer> stack = new Stack<Integer>();
    	int result = 0;
    	int number = 0;
    	char sign = '+';
    	int len = s.length();
    	for(int i = 0; i < len; i++){
    		char ch = s.charAt(i);
    		if(Character.isDigit(ch)){
    			number = 10 * number + (ch - '0');
    		}
    		if((!Character.isDigit(ch) && !(ch == ' '))|| i == len -1){
    			if(sign == '+')
    				stack.push(number);
    			else if(sign == '-')
        			stack.push(-number);
        		else if(sign == '*')
        			stack.push(stack.pop() * number);
        		else if(sign == '/')
        			stack.push(stack.pop() / number);
    			sign = ch;
    			number = 0;
    		}
    	}
    	for(int ele: stack)
    		result += ele;
    	return result;
    }
}
