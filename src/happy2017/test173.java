package happy2017;

import java.util.Stack;

import happy2017.test101.TreeNode;

//173. Binary Search Tree Iterator
public class test173 {
	private Stack<TreeNode> stack = new Stack<>();
	
    public test173(TreeNode root) {
        while(root != null) {
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
        TreeNode top = stack.pop();
        TreeNode right = top.right;
        while(right != null) {
        	stack.push(right);
        	right = right.left;
        }
        return top.val;
    }
}

/**  LinkedIn Google Facebook Microsoft
 * 
 */