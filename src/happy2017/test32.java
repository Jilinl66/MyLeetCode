package happy2017;

import java.util.Stack;

//32. Longest Valid Parentheses
public class test32 {
	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				stack.push(i);
			} else {
				if(!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
					stack.pop();
				} else {
					stack.push(i);
				}
			}
		}
		if(stack.isEmpty()) {
			return s.length();
		}
		int longest = 0;
		int a = s.length(), b = 0;
		while(!stack.isEmpty()) {
			b = stack.pop();
			longest = Math.max(a - b - 1, longest);
			a = b;
		}
		longest = Math.max(longest, a);
		return longest;
    }
}