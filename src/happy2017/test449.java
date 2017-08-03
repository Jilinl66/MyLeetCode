package happy2017;

import java.util.LinkedList;
import java.util.Queue;

//449. Serialize and Deserialize BSTdrde
public class test449 {
	public static void main(String[] args){
		String s = "1#2#*#";
		System.out.println(s.split("#")[2]);
	}
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder sBuilder = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        sBuilder.append(root.val).append("#");
        while(!queue.isEmpty()){
        	TreeNode cur = queue.poll(); 
        	if(cur.left != null){
        		queue.offer(cur.left);
        		sBuilder.append(cur.left.val).append("#");
        	}
        	else
        		sBuilder.append("*#");
        	if(cur.right != null){
        		queue.offer(cur.right);
        		sBuilder.append(cur.right.val).append("#");
        	}
        	else
        		sBuilder.append("*#");
        }
        return sBuilder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	if(data == "") return null;
    	Queue<TreeNode> queue = new LinkedList<>();
    	String[] vals = data.split("#");
    	TreeNode root = new TreeNode(Integer.valueOf(vals[0]));
    	queue.offer(root);
        for(int i = 1; i < vals.length && !queue.isEmpty(); i++){
        	TreeNode cur = queue.poll();
        	if(!vals[i].equals("*")){
        		TreeNode left = new TreeNode(Integer.valueOf(vals[i]));
        		queue.offer(left);
        		cur.left = left;
        	}
        	else
        		cur.left = null;
        	i++;
        	if(!vals[i].equals("*")){
        		TreeNode right = new TreeNode(Integer.valueOf(vals[i]));
        		queue.offer(right);
        		cur.right = right;
        	}
        	else
        		cur.right = null;
        }
        return root;
    }
}
