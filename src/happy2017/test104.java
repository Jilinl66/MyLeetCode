package happy2017;

import happy2017.test101.TreeNode;

//104. Maximum Depth of Binary Tree 
public class test104 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
