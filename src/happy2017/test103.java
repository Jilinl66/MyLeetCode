package happy2017;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import happy2017.test101.TreeNode;

//103. Binary Tree Zigzag Level Order Traversal
public class test103 {
	
	// My method is correct but so long!
	
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//    	List<List<Integer>> res = new ArrayList<List<Integer>>();
//    	if(root == null)
//    		return res;
//    	Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
//    	queue.offer(root);
//    	int level = 1;
//    	while(!queue.isEmpty()){
//    		int count = queue.size();
//    		List<Integer> list = new LinkedList<>();
//    		for(int i = 0; i < count; i++){
//    			TreeNode cur = queue.poll();
//    			if(cur.left != null)
//    				queue.offer(cur.left);    			
//    			if(cur.right != null)
//    			queue.offer(cur.right);
//			if(level % 2 == 1)
//    			list.add(cur.val);
//			else
//				list.add(0, cur.val);
//    		}
//    		res.add(list);
//    		level ++;
//    	}
//    	return res;
//    }
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		travel(root, res, 0);
		return res;
	}
	
	private void travel(TreeNode cur, List<List<Integer>> res, int level) {
		if(cur == null)
			return;
		if(res.size() <= level){
			List<Integer> newlist = new LinkedList<>();
			res.add(newlist);
		}
		List<Integer> collection = res.get(level);
		if(level % 2 == 0)
			collection.add(cur.val);
		else
			collection.add(0, cur.val);
		travel(cur.left, res, level + 1);
		travel(cur.right, res, level + 1);
	}
}
