package happy2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import happy2017.test101.TreeNode;

//94. Binary Tree Inorder Traversal
public class test94 {	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		while(curr != null || !stack.isEmpty()) {
			while(curr != null) {
			stack.push(curr);
			curr = curr.left;
			}
			curr = stack.pop();
			res.add(curr.val);
			curr = curr.right;
		}
		return res;
	}
	
	/**
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	if(root == null) return res;
    	helper(res, root);
    	return res;
    }
    
    private void helper(List<Integer> res, TreeNode root) {
    	if(root == null) return;
    	helper(res, root.left);
    	res.add(root.val);
    	helper(res, root.right);
    }
    */
}
