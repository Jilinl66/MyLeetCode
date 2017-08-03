package happy2017;

//105. Construct Binary Tree from Preorder and Inorder Traversal
public class test105 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if(preorder.length == 0) return null;
        return helper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int l1, int r1, int l2 ,int r2) {
    	if(l1 == r1) return new TreeNode(preorder[l1]);
    	if(l1 < r1) return null;
    	TreeNode root = new TreeNode(preorder[l1]);
    	int idx = l2;
    	while(inorder[idx] != preorder[l1])
    		idx++;
    	root.left = helper(preorder, inorder, l1 + 1, l1 + idx - l2, l2, idx - 1);
    	root.right = helper(preorder, inorder, l1 + 1 + idx - l2, r1, idx + 1, r2);
    	return root;
    }
}
