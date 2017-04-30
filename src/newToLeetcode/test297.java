package newToLeetcode;
//297. Serialize and Deserialize Binary Tree
// My method BFS

import java.util.Deque;
import java.util.LinkedList;

public class test297 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		test297 test = new test297();
		TreeNode t1 = test.new TreeNode(1);
		TreeNode t2 = test.new TreeNode(2);
		t1.left = t2;
//		String resString = serialize(t1);
//		System.out.println(resString);
	}
	
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuilder sBuilder = new StringBuilder();
		Deque<TreeNode> dq = new LinkedList<TreeNode>();
		dq.offer(root);
		while(!dq.isEmpty()){
			TreeNode tNode = dq.pop();
			if (tNode == null){
				sBuilder.append("null").append(",");
				continue;
			}
			sBuilder.append(String.valueOf(tNode.val)).append(",");
			if (tNode.left != null)
				dq.offer(tNode.left);
			else
				dq.offer(null);
			if (tNode.right != null)
				dq.offer(tNode.right);
			else
				dq.offer(null);
		}
		sBuilder.deleteCharAt(sBuilder.length() - 1);
		return sBuilder.toString();
	}
	
	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
	    if(data.isEmpty() || data.equals("null"))
	    	return null;
	    Deque<TreeNode> deque = new LinkedList<TreeNode>();
	    String[] nodes = data.split(",");
	    TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
	    deque.offer(root);
	    int i = 1;
	    while(!deque.isEmpty() && i< nodes.length){
	    	TreeNode curNode = deque.pop();
	    	if(!nodes[i].equals("null")){
	    		TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
	    		curNode.left = left;
	    		deque.offer(left);
	    	}
	    	if(!nodes[i+1].equals("null")){
	    		TreeNode right = new TreeNode(Integer.parseInt(nodes[i+1]));
	    		curNode.right = right;
		    	deque.offer(right);
	    	}
	    	i +=2;
	    }
	    return root;
	}
}
