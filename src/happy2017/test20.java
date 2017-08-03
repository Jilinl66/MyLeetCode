package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

//20. Valid Parentheses
public class test20 {
	public boolean isValid(String s) {
		List<Character> left = new ArrayList<>(Arrays.asList('(', '{', '['));
		Stack<Character> stack = new Stack<>();
		for(char c: s.toCharArray()) {
			if(left.contains(c))
				stack.push(c);
			else {
				char leftPair = 0;
				if(c == ')')
					leftPair = '(';
				else if (c == '}')
					leftPair = '{';
				else
					leftPair = '[';
				if(stack.isEmpty() || stack.pop() != leftPair)
					return false;
			}
		}
		return stack.isEmpty();
	}
}
