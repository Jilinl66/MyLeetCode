package happy2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import happy2017.test101.TreeNode;

//144. Binary Tree Preorder Traversal
public class test144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
        	if(cur == null){
        		cur = stack.pop().right;
        		continue;
        	}
        	res.add(cur.val);
        	stack.push(cur);
        	cur = cur.left;
        }
        return res;
    }
}
