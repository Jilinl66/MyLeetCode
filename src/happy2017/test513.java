package happy2017;

import java.util.LinkedList;
import java.util.Queue;

import happy2017.test101.TreeNode;

//513. Find Bottom Left Tree Value
public class test513 {
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode cur = null;
        while(!queue.isEmpty()){
        	cur = queue.poll();
    		if(cur.right != null)
    			queue.offer(cur.right);
    		if(cur.left != null)
    			queue.offer(cur.left);
        }
        return cur.val;
    }
}
