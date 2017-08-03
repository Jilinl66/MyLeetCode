package happy2017;

import java.util.LinkedList;
import java.util.Queue;

import happy2017.test101.TreeNode;

//226. Invert Binary Tree
public class test226 {
//    public TreeNode invertTree(TreeNode root) {
//        if(root == null)
//        	return null;
//        TreeNode left = root.left, right = root.right;
//        root.left = invertTree(right);
//        root.right = invertTree(left);
//        return root;
//    }
    
    public TreeNode invertTree(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	while(!queue.isEmpty()){
    		TreeNode node = queue.poll();
    		TreeNode left = node.left, right = node.right;
    		node.left = right;
    		node.right = left;
    		if(node.left != null)
    			queue.offer(node.left);
    		if(node.right != null)
    			queue.offer(node.right);
    	}
    	return root;
    }
}