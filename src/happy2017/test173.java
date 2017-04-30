package happy2017;

import java.util.Stack;

import happy2017.test101.TreeNode;

//173. Binary Search Tree Iterator
public class test173 {
	public class BSTIterator {
		Stack<TreeNode> stack = new Stack<>();
	    public BSTIterator(TreeNode root) {
	       while(root != null){
	    	   stack.push(root);
	    	   root = root.left;
	       }
	    }
 
	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !stack.isEmpty();
	    }

	    /** @return the next smallest number */
	    public int next() {
	        TreeNode node = stack.pop();
	        int val = node.val;
	        node = node.right;
	        while(node != null){
	        	stack.push(node);
	        	node = node.left;
	        }
	        return val;
	    }
	}
}
