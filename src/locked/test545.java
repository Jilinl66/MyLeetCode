package locked;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import locked.test536.TreeNode;

//545. Boundary of Binary Tree
public class test545 {
	List<Integer> res = new LinkedList<>();
	
	public List<Integer> boundaryOfBinaryTree(TreeNode root) {
		if(root == null) return res;
		res.add(root.val);
		leftBoundary(root.left);
		leaves(root.left);
		leaves(root.right);
		rightBoundary(root.right);
		return res;
	}
	
	private void leftBoundary(TreeNode root) {
		if(root == null || (root.left == null && root.right == null)) return;
		res.add(root.val);
		if(root.left == null) leftBoundary(root.right);
		else leftBoundary(root.left);
	}
	
	private void rightBoundary(TreeNode root) {
		if(root == null || (root.left == null && root.right == null)) return;
		if(root.right == null) rightBoundary(root.left);
		else rightBoundary(root.right);
		res.add(root.val);
	} 
	  
	private void leaves(TreeNode root) {
		if(root == null) return;
		if(root.left == null && root.right == null) {
			res.add(root.val);
			return;
		}
		leaves(root.left);
		leaves(root.right);
	}
	
	/**
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        List<Integer> curLine = new ArrayList<Integer>();
        int insertP = 0;
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	curLine.clear();
        	for(int i = 0; i < size; i++) {
        		TreeNode curr = queue.poll();
        		curLine.add(curr.val);
        		if(i == 0) {
        			res.add(insertP, curr.val);
        			insertP++;
        		}
        		else if(i == size - 1){
        			res.add(insertP);
        		}
        		if(curr.left != null)
        			queue.offer(curr.left);
        		if(curr.right != null)
        			queue.offer(curr.right);
        	}
        }
        for(int i = 1; i < curLine.size() - 1; i++) {
        	res.add(insertP, curLine.get(i));
        	insertP++;
        }
        return res;
    }
    **/
}
