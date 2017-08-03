package happy2017;

import java.util.Stack;

//101. Symmetric Tree
public class test101 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}

//	recursive
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null)
//        	return true;
//        return helper(root.left, root.right);
//    }
//    private boolean helper(TreeNode left, TreeNode right) {
//    	if(left == null || right == null)
//    		return left == right;
//    	if(left.val != right.val)
//    		return false;
//    	return helper(left.left, right.right) && helper(left.right, right.left);	
//	}
	
	//no recursive, stack
		public boolean isSymmetric(TreeNode root) {
			if(root == null)
				return true;
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode left, right;
			if ((root.left == null && root.right != null) ||(root.left != null && root.right == null))
				return false;
			if(root.left != null && root.right != null){
				stack.push(root.left);
				stack.push(root.right);
			}
			while(!stack.empty()){
				if(stack.size() % 2 != 0)
					return false;
				right = stack.pop();
				left = stack.pop();
				if(left.val != right.val)
					return false;
				if ((left.left == null && right.right != null) || (left.left != null && right.right == null))
					return false;
				if(left.left != null && right.right != null){
					stack.push(left.left);
					stack.push(right.right);
				}
				if ((left.right == null && right.left != null) || (left.right != null && right.left == null))
					return false;
				if(left.right != null && right.left != null){
					stack.push(left.right);
					stack.push(right.left);
				}
			}
			return true;
		}
}
