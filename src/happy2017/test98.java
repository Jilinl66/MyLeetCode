package happy2017;

import happy2017.test101.TreeNode;

//98. Validate Binary Search Tree
public class test98 {
    public boolean isValidBST(TreeNode root) {
    	 return isValidSubTree(root, null, null);
    }
    
    private boolean isValidSubTree(TreeNode root, Integer min, Integer max) {
    	if(root == null) return true;
		if((min != null && root.val <= min) || (max != null && root.val >= max)) return false;
		return isValidSubTree(root.left, min, root.val) && isValidSubTree(root.right, root.val, max);
	}
}