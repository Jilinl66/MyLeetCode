package happy2017;

// 230. Kth Smallest Element in a BST
public class test230 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int kthSmallest(TreeNode root, int k) {
		int leftNodes = countNodes(root.left);
		if(k <= leftNodes)
			return kthSmallest(root.left, k);
		else if(k > leftNodes + 1) 
			return kthSmallest(root.right, k - leftNodes - 1);
		else
			return root.val;
	}
	
	private int countNodes(TreeNode root) {
		if(root == null) return 0;
		return 1 + countNodes(root.left) + countNodes(root.right);
	}
}
