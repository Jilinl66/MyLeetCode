package happy2017;

//106. Construct Binary Tree from Inorder and Postorder Traversal
public class test106 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length - 1, 0, inorder.length - 1, inorder, postorder);
    }
    
    public TreeNode helper(int postend, int instart, int inend, int[] inorder, int[] postorder){
    	if(postend < 0 || instart > inend)
    		return null;
    	TreeNode root = new TreeNode(postorder[postend]);
    	int inIndex = 0;
    	for(int i = instart; i <= inend; i++)
    		if(inorder[i] == root.val)
    			inIndex = i;
    	root.right = helper(postend - 1, inIndex + 1, inend, inorder, postorder);
    	root.left = helper(postend - (inend - inIndex) - 1, instart, inIndex - 1, inorder, postorder);
    	return root;
    }
}
