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
		if(root == null) return;
		TreeLinkNode pre = root;
		TreeLinkNode curr = null;
		while(pre.left != null) {
			curr = pre;
			while(curr != null) {
				curr.left.next = curr.right;
				if(curr.next != null)
					curr.right.next = curr.next.left;
				curr = curr.next;
			}
			pre = pre.left;
		}
	}
	
//    public void connect(TreeLinkNode root) {
//    	if(root == null) return;
//    	Queue<TreeLinkNode> queue = new LinkedList<>();
//    	queue.offer(root);
//    	while(!queue.isEmpty()) {
//    		int n = queue.size();
//    		for(int i = 0; i < n; i++) {
//    			TreeLinkNode curr = queue.poll();
//    			if(curr.left != null) {
//    				queue.offer(curr.left);
//    				queue.offer(curr.right);
//    			}
//    			if(i == n - 1)
//    				curr.next = null;
//    			else
//    				curr.next = queue.peek();
//    		}
//    	}
//    }
}
