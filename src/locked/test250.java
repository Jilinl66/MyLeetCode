package locked;

import locked.test156.TreeNode;

//250. Count Univalue Subtrees
public class test250 {
	//Recursion
	int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        isUniversalSubtree(root, 0);
        return count;
    }
    
    public boolean isUniversalSubtree(TreeNode root, int val) {
    	if(root == null) 
    		return true;
    	if(!isUniversalSubtree(root.left, root.val) | !isUniversalSubtree(root.right, root.val)) 
    		return false;
    	count ++;
    	return root.val == val;
    }
}
