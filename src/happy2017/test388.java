package happy2017;

import java.util.Stack;

//388. Longest Absolute File Path
public class test388 {
    public int lengthLongestPath(String input) {
    	String[] strs = input.split("\n");
    	Stack<Integer> stack = new Stack<>();
    	int maxLen = 0;
    	for(String s: strs) {
    		int level = s.lastIndexOf("\t") + 1;
			while(level < stack.size()) stack.pop();
			stack.push(stack.isEmpty()? s.length() - level: s.length() - level + 1 + stack.peek());
    		if(s.contains("."))
    			maxLen = Math.max(maxLen, stack.peek());
    	}
    	return maxLen;
    }
}

/** 
 * Google
 * "/" in the path
 */