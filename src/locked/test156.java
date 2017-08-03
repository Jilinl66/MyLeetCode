package locked;
//156. Binary Tree Upside Down
public class test156 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root == null) return null;
        return helper(root.left, root);
    }
    
    private TreeNode helper(TreeNode root, TreeNode parent) {
    	if(root == null) return parent;
		TreeNode node = helper(root.left, root);
		root.left = parent.right;
		root.right = parent;
		//The folowing two lines important!
		parent.left = null;
		parent.right = null;
		return node;
	}
}
