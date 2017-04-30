package happy2017;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import happy2017.test101.TreeNode;

///107. Binary Tree Level Order Traversal II
public class test107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(root == null)
    		return res;
    	Queue<TreeNode> queue = new ArrayDeque<>();
    	queue.offer(root);
    	while(!queue.isEmpty()){
    		List<Integer> cur = new ArrayList<Integer>();
    		int iter = queue.size();
    		for(int i = 0; i< iter; i++){
    			TreeNode curNode = queue.poll();
    			if(curNode.left != null)
    				queue.offer(curNode.left);
    			if(curNode.right != null)
    				queue.offer(curNode.right);
    			cur.add(curNode.val);
    		}
    		res.add(cur);
    	}
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	for(int i = res.size() - 1; i >=0; i--)
    		result.add(res.get(i));
    	return result;
    }
}
