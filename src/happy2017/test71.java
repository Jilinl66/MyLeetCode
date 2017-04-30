package happy2017;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

//71. Simplify Path
public class test71 {
    public String simplifyPath(String path) {
    	String reString = "";
    	Set<String> skipEle = new HashSet<>(Arrays.asList("", ".", ".."));
    	Stack<String> stack = new Stack<>();
    	for(String str: path.split("/")){
    		if(str.equals("..") && !stack.isEmpty()) 
    			stack.pop();
    		else if(!skipEle.contains(str))
    			stack.push(str);
    	}
    	for(String dir: stack){
    		System.out.println(dir);
    		reString = "/" + dir + reString;
    	}
    	return reString.isEmpty() ? "/": reString;
    }
}
