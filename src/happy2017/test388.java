package happy2017;

import java.util.Stack;

//388. Longest Absolute File Path
public class test388 {
    public int lengthLongestPath(String input) {
    	if(input == null || input.length() == 0) return 0;
    	int longestLen = 0, level = -1, len = 0;
    	Stack<Integer> stack = new Stack<>();
    	stack.push(0);
    	for(String path: input.split("\n")){
    		int oldLevel = level;
    		level = path.lastIndexOf("\t") + 1;
    		for(int i = 0; i < oldLevel - level + 1; i++)
    			 stack.pop();
    		len = stack.peek() + path.length() - level;
    		stack.push(len);
    		if(path.contains("."))
    			longestLen = Math.max(longestLen, len + stack.size() - 2) ;
    	}
    	return longestLen; 
    }
}