package happy2017;

import happy2017.test101.TreeNode;

//98. Validate Binary Search Tree
public class test98 {
    public boolean isValidBST(TreeNode root) {
    	return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
    	if(root == null) return true;
    	if(root.val >= maxVal || root.val <= minVal) return false;
    	return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
	}
    
}