package happy2017;

import happy2017.test101.TreeNode;

//111. Minimum Depth of Binary Tree
public class test111 {
    public int minDepth(TreeNode root) {
    	if(root == null)
    		return 0;
    	if(root.left == null && root.right == null)
    		return 1;
        if(root.left != null && root.right!= null)
        	return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        else if(root.left == null)
        	return 1 + minDepth(root.right);
        else {
			return 1 + minDepth(root.left);
		}
    }
}
