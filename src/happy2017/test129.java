package happy2017;

import happy2017.test101.TreeNode;

//129. Sum Root to Leaf Numbers
public class test129 {
	int sum;
	
    public int sumNumbers(TreeNode root) {
    	sum = 0;
    	dfs(root, 0);
    	return sum;
    }
    
    private void dfs(TreeNode root, int num) {
    	if(root == null) return;
		if(root.left == null && root.right == null) {
			sum += num * 10 + root.val;
			return;
		}
		dfs(root.left, num * 10 + root.val);
		dfs(root.right, num * 10 + root.val);
	}
}
