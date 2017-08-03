package locked;

import java.util.Stack;

//536. Construct Binary Tree from String
public class test536 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
    public TreeNode str2tree(String s) {
    	Stack<TreeNode> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(c == '(') continue;
        	if(c == ')') {
        		TreeNode child = stack.pop();
        		TreeNode parent = stack.pop();
        		if(parent.left == null)
        			parent.left = child;
        		else
        			parent.right = child;
        		stack.push(parent);
        	}
        	else {
        		int sign = 1;
        		if (c == '-') { //Forget '-', read question carefully
        			sign = -1;
        			i ++;
        		}
    			int num = 0; 
    			while(i < s.length() && Character.isDigit(s.charAt(i)))
    				num = 10 * num + Character.getNumericValue(s.charAt(i++));
    			i--; //Easy to mistake
        		stack.push(new TreeNode(sign * num));
        	}
        }
        return stack.isEmpty()? null: stack.peek();
    }
}
