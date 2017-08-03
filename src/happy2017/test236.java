package happy2017;

import happy2017.test101.TreeNode;

///236. Lowest Common Ancestor of a Binary Tree
public class test236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root | q == root) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null) return root;
        return left!= null ? left: right;
    }
}
