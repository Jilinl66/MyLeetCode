package happy2017;

import happy2017.test101.TreeNode;

//538. Convert BST to Greater Tree
public class test538 {
	int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        computeSum(root);
        return root;
    }
    
    private void computeSum(TreeNode node) {
		if(node == null) return;
		computeSum(node.right);
		node.val += sum;
		sum = node.val;
		computeSum(node.left);
	}
}
