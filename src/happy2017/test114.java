// 114. Flatten Binary Tree to Linked List
 package happy2017;
public class test114 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
	TreeNode pre = null;
	
	public void flatten(TreeNode root) {
		if(root == null) return;
		flatten(root.right);		
		flatten(root.left);
		root.left = null;
		root.right = pre;
		pre = root;
	}
}