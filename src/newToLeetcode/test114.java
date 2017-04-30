// 114. Flatten Binary Tree to Linked List
package newToLeetcode;
public class test114 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
	private TreeNode prev = null;
	
	public void flatten(TreeNode root) {
		if(root == null){
			return;
		}
		flatten(root.right);
		flatten(root.left);
		root.right = prev;
		root.left = null;
		prev = root;
    }
}
