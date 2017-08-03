package happy2017;

import happy2017.test101.TreeNode;

//530. Minimum Absolute Difference in BST
public class test530 {
	int min = Integer.MAX_VALUE;
	Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
    	if(root == null) return min;
    	getMinimumDifference(root.left);
    	if(prev != null)
    		min = Math.min(min, Math.abs(root.val - prev));
    	prev = root.val;
    	getMinimumDifference(root.right);
    	return min;
    }
}