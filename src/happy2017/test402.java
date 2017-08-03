package happy2017;

import java.util.Stack;

//402. Remove K Digits
public class test402 {
    public String removeKdigits(String num, int k) {
    	if(k > num.length()) return "0";
    	Stack<Character> stack = new Stack<>();
    	int i = 0;
    	while(i < num.length() && k > 0) {
    		while(!stack.isEmpty() && k > 0 && num.charAt(i) - '0' < stack.peek() - '0') {
    			stack.pop();
    			k--;
    		}
    		stack.push(num.charAt(i));
    		i++;
    	}
    	while(i < num.length())
    		stack.push(num.charAt(i++));
    	while(k-- > 0)
    		stack.pop();
    	String res = "";
    	while(!stack.isEmpty())
    		res = stack.pop() + res;
    	i = 0;
    	while(i < res.length() && res.charAt(i) == '0')
    		i++;
    	return i == res.length()? "0": res.substring(i);
    }    
}	
