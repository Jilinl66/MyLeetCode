package newToLeetcode;

public class test230 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        if(k <=  count){
        	return kthSmallest(root.left, k);
        }
        else if ( k > count + 1){
        	return kthSmallest(root.right, k - 1 - count);
        }
        else {
			return root.val;
		}
    }
	
	public int countNodes(TreeNode node){
		if (node == null){
			return 0;
		}
		return 1 + countNodes(node.left) + countNodes(node.right);
	}
}
