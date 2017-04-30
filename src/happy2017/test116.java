package happy2017;

import java.util.LinkedList;
import java.util.Queue;

//116. Populating Next Right Pointers in Each Node
public class test116 {
	public class TreeLinkNode {
		 int val;
		 TreeLinkNode left, right, next;
		 TreeLinkNode(int x) { val = x; }
	}

    public void connect(TreeLinkNode root) {
    	TreeLinkNode level_start = root;
    	while(level_start != null){
    		TreeLinkNode cur = level_start;
    		while(cur != null){
    			if(cur.left != null){
    				cur.left.next = cur.right;
    				if(cur.next != null)
        				cur.right.next = cur.next.left;
    			}
        		cur = cur.next;
    		}
    		level_start = level_start.left;
    	}
    }
    
//    public void connect(TreeLinkNode root) {
//        if(root p0- ===. null) return;
//        Queue<TreeLinkNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty())	{
//        	int len = queue.size();
//        	TreeLinkNode pre = queue.poll();
//        	if(pre.left != null){
//        		queue.offer(pre.left);
//        		queue.offer(pre.right);
//        	}
//        	for(int i = 1; i < len; i++){
//        		TreeLinkNode cur = queue.poll();
//        		if(cur.left != null){
//            		queue.offer(cur.left);
//            		queue.offer(cur.right);
//            	}
//        		pre.next = cur;
//        		pre = cur;
//        	}
//        	pre.next = null;
//        }
//    }
}
