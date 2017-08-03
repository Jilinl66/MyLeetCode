package locked;

import locked.test156.TreeNode;

//298. Binary Tree Longest Consecutive Sequence
public class test298 {
	int max = Integer.MIN_VALUE;
	
	public int longestConsecutive(TreeNode root) {
		if(root == null) return 0;
		helper(root, 0, root.val);
		return max;
	} 
    
    private void helper(TreeNode root, int count, int target) {
    	if(root == null) return;
    	if(root.val == target)
    		count++;
    	else 
    		count = 1;
    	max = Math.max(max, count);
    	helper(root.left, count, root.val + 1);
    	helper(root.right, count, root.val + 1);
    }
}
