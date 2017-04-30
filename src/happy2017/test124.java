package happy2017;

import happy2017.test101.TreeNode;

///124. Binary Tree Maximum Path Sum
public class test124 {
    int maxValue;

    public int maxPathSum(TreeNode root) {
    	maxValue = Integer.MIN_VALUE;
    	maxPathdown(root);
    	return maxValue;
    }
    
    public int maxPathdown(TreeNode node) {
		if(node == null)
			return 0;
		int left = Math.max(0, maxPathdown(node.left));
		int right = Math.max(0, maxPathdown(node.right));
		maxValue = Math.max(maxValue, left + right + node.val);
		return Math.max(left, right) + node.val;
	}
}
