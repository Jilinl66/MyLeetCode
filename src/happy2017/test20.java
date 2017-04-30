package happy2017;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//20. Valid Parentheses
public class test20 {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(')
				stack.push(')');
			else if(s.charAt(i) == '[')
				stack.push(']');
			else if(s.charAt(i) == '{')
				stack.push('}');
			else if(stack.isEmpty() || stack.pop() != s.charAt(i)) return false;
		}
		return true;
	}
//    public boolean isValid(String s) {
//        Map<Character, Character> map = new HashMap<>();
//        map.put(')', '(');
//        map.put(']', '[');
//        map.put('}', '{');
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0; i < s.length(); i++){
//        	char cur = s.charAt(i);
//        	if(map.containsValue(cur))
//        		stack.push(cur);
//        	else if(map.containsKey(cur))
//        		if(stack.isEmpty() || !stack.pop().equals(map.get(cur))) return false;
//        }
//        return stack.isEmpty();
//    }
}
