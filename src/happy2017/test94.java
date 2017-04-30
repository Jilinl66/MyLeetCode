package happy2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import happy2017.test101.TreeNode;

//94. Binary Tree Inorder Traversal
public class test94 {
//    public List<Integer> inorderTraversal(TreeNode root) {
//    	List<Integer> res = new ArrayList<Integer>();
//    	if(root == null)
//    		return res;
//    	Stack<TreeNode> stack = new Stack<TreeNode>();
//    	while(root != null){
//    		stack.push(root);
//    		root = root.left;
//    	}
//        while(!stack.isEmpty()){
//        	TreeNode cur = stack.pop();
//        	res.add(cur.val);
//        	cur = cur.right;
//        	while(cur != null){
//        		stack.push(cur);
//        		cur = cur.left;
//        	}
//        }
//        return res;
//    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	if(root == null)
    		return res;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode cur = root;
    	while(cur != null || !stack.isEmpty()){
    		while(cur != null){
    			stack.add(cur);
    			cur = cur.left;
    		}
	    	cur = stack.pop();
	    	res.add(cur.val);
	    	cur = cur.right;
    	}
    	return res;
    }
}
