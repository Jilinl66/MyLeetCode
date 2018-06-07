package happy2017;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import happy2017.test95.TreeNode;

//102. Binary Tree Level Order Traversal
public class test102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(root == null) return res;
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		int size = queue.size();
    		List<Integer> list = new ArrayList<>();
    		for(int i = 0; i < size; i++) {
    			TreeNode curr = queue.poll();
    			list.add(curr.val);
    			if(curr.left != null) queue.offer(curr.left);
    			if(curr.right != null) queue.offer(curr.right);
    		}
    		res.add(list);
    	}
    	return res;
    }
}
