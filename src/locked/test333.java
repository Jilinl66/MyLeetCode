package locked;

import locked.test156.TreeNode;

//333. Largest BST Subtree
public class test333 {
    public int largestBSTSubtree(TreeNode root) {
    	if(root == null) return 0;
     	if(isValid(root, null, null))
    		return count(root);
    	 return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
    }
    
    private boolean isValid(TreeNode root, Integer min, Integer max) {
    	if(root == null) return true;
    	if((min != null && root.val<= min) || (max != null && root.val >= max) ) return false;
    	return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
	}
    
    private int count(TreeNode root) {
		if(root == null) return 0;
		return 1 + count(root.left) + count(root.right);
	}
}

//Microsoft