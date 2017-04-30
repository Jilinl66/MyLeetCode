package happy2017;

import happy2017.test101.TreeNode;

//129. Sum Root to Leaf Numbers
public class test129 {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    
    public int sum(TreeNode node, int s) {
		if(node == null) return 0;
		if(node.left == null && node.right == null)
			return s * 10 + node.val;
		return sum(node.left, s * 10 + node.val) + sum(node.right, s * 10 + node.val);
		
	}
 }
