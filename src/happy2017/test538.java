package happy2017;

import happy2017.test101.TreeNode;

//538. Convert BST to Greater Tree
public class test538 {
	int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        reverseInorder(root);
        return root;
    }
    
    private void reverseInorder(TreeNode root) {
    	if(root == null) return;
    	reverseInorder(root.right);
    	root.val += sum;
    	sum = root.val;
    	reverseInorder(root.left);
	}
}
