package happy2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import happy2017.test101.TreeNode;

//145. Binary Tree Postorder Traversal
public class test145 {
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode cur = root, lastNodeVisited = null;
    	while(cur != null || !stack.isEmpty()){
    		if(cur != null){
    			stack.push(cur);
    			cur = cur.left;
    		}
    		else{
    			TreeNode peek = stack.peek();
    			if(peek.right != null && lastNodeVisited != peek.right)
    				cur = peek.right;
    			else{
    				res.add(peek.val);
    				lastNodeVisited = stack.pop();
    			}
    		}
    	}
    	return res;
    }
}
