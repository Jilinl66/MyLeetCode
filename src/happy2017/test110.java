package happy2017;

import happy2017.test101.TreeNode;

//110. Balanced Binary Tree
public class test110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        	return true;
        return height(root) != -1;
    }
    
    public int height(TreeNode node) {
		if(node == null)
			return 0;
		int lHeight = height(node.left); 
		if(lHeight == -1)
			return -1;
		int rHeight = height(node.right);
		if(rHeight == -1)
			return -1;
		if(lHeight - rHeight < -1 || lHeight - rHeight > 1)
			return -1;
		return Math.max(lHeight, rHeight) + 1;
	}
}
