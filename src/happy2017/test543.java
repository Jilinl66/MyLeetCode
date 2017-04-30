package happy2017;

import happy2017.test101.TreeNode;

//543. Diameter of Binary Tree
public class test543 {
	int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
    	maxPath(root);
    	return max;
    }
    
    private int maxPath(TreeNode root){
    	if(root == null) return 0;
    	int left = maxPath(root.left);
    	int right = maxPath(root.right);
    	max = Math.max(max, left + right);
    	return Math.max(left, right) + 1;
    }
}
