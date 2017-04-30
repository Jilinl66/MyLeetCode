package locked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import locked.test156.TreeNode;

//314. Binary Tree Vertical Order Traversal
public class test314 {
	
	Map<Integer, List<Integer>> map;
    public List<List<Integer>> verticalOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(root == null) return res;
    	map = new HashMap<Integer, List<Integer>>();
    	Queue<TreeNode> queue = new LinkedList<>();
    	Queue<Integer> colNums = new LinkedList<>();
    	queue.add(root);
    	colNums.add(0);
    	BFS(queue, colNums);
    	Map<Integer, List<Integer>> sortedMap = new TreeMap<>(map);
    	for(int k: sortedMap.keySet())
    		res.add(sortedMap.get(k));
    	return res;
    }
    
    private void BFS(Queue<TreeNode> queue, Queue<Integer> colNum) {
    	while(!queue.isEmpty()) {
    		TreeNode cur = queue.poll();
    		int lineNum = colNum.poll();
    		if(!map.containsKey(lineNum))
    			map.put(lineNum, new ArrayList<>());
    		map.get(lineNum).add(cur.val);
    		if(cur.left != null) {
    			queue.offer(cur.left);
    			colNum.offer(lineNum - 1);
    		}
    		if(cur.right != null) {
    			queue.offer(cur.right);
    			colNum.offer(lineNum + 1);
    		}	
    	}
	}
    
//	Map<Integer, List<Integer>> map;
//    public List<List<Integer>> verticalOrder(TreeNode root) {
//    	List<List<Integer>> res = new ArrayList<>();
//    	map = new HashMap<Integer, List<Integer>>();
//    	DFS(root, 0);
//    	Map<Integer, List<Integer>> sortedMap = new TreeMap<>(map);
//    	for(int k: sortedMap.keySet())
//    		res.add(sortedMap.get(k));
//    	return res;
//    }
//    
//    private void DFS(TreeNode root, int lineNum) {
//		if(root == null) return;
//		if(!map.containsKey(lineNum))
//			map.put(lineNum, new ArrayList<>());
//		map.get(lineNum).add(root.val);
//		DFS(root.left, lineNum - 1);
//		DFS(root.right, lineNum + 1);
//	}
}

//Google Snapchat Facebook
//DFS can't gaurantee from top to bottom