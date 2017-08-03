package happy2017;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

//71. Simplify Path
public class test71 {
    public String simplifyPath(String path) {
    	String res = "";
    	Set<String> skip = new HashSet<>(Arrays.asList("", ".", ".."));
    	Stack<String> stack = new Stack<>();
    	for(String str: path.split("/")) {
    		if(str.equals("..") && !stack.isEmpty())
    			stack.pop();
    		if(!skip.contains(str))
    			stack.push(str);
    	}
    	while(!stack.isEmpty())
    		res = "/" + stack.pop() + res;
    	return res.length() == 0? "/": res;
    }
}
