package locked;

import java.util.ArrayList;
import java.util.List;

import locked.test156.TreeNode;

//366. Find Leaves of Binary Tree
public class test366 {
    public List<List<Integer>> findLeaves(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<>();
    	 while(root != null) {
    		 List<Integer> list = new ArrayList<>();
    		 root = dfs(res, list, null, root, 0);
    		 res.add(list);
    	 }
    	 return res;
    }
    
    public TreeNode dfs(List<List<Integer>> res, List<Integer> list, TreeNode parent, TreeNode root, int flag) {
    	if(root.left == null && root.right == null) {
    		list.add(root.val);
    		if(flag == 1) {
    			parent.left = null;
    		}
    		else if(flag == 2) {
    			parent.right = null;
    		}
    		else {
    			root = null;
    		}
    		return root;
    	}
    	if(root.left != null)
    		dfs(res, list, root, root.left, 1);
    	if(root.right != null)
    		dfs(res, list, root, root.right, 2);
		return root;
    }
}

//LinkedIn