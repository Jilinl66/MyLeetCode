package happy2017;

import happy2017.test101.TreeNode;

//404. Sum of Left Leaves
public class test404 {
    public int sumOfLeftLeaves(TreeNode root) {
    	if(root == null) return 0;
    	int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null)
        	sum += root.left.val;
        return sum += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
