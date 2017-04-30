package locked;

import java.util.Stack;

import locked.test156.TreeNode;

//285. Inorder Successor in BST
public class test285 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    	Stack<TreeNode> stack = new Stack<>();
        inoder(root, p, stack);
        if(stack.isEmpty()) return null;
        return stack.pop();
    }
    
    private void inoder(TreeNode root, TreeNode p, Stack<TreeNode> stack) {
		if(root == null) return;
		inoder(root.right, p, stack);
		if(root.val <= p.val) return;
		stack.push(root);
		inoder(root.left, p, stack);
	}
}

// Pocket Gems Microsoft Facebook