package happy2017;

//117. Populating Next Right Pointers in Each Node II
public class test117 {
	public class TreeLinkNode {
		 int val;
		 TreeLinkNode left, right, next;
		 TreeLinkNode(int x) { val = x; }
	}
	
    public void connect(TreeLinkNode root) {
    	TreeLinkNode level_start = root;
    	TreeLinkNode next_level_start = null;
    	TreeLinkNode pre = null, next = null;
    	while(level_start != null){
    		TreeLinkNode cur = level_start;
    		while(cur != null){
	    		if(cur.left != null){
	    			if(next_level_start == null){
	    				next_level_start = cur.left;
	    				pre = cur.left;
	    			}
	    			else{
	    				next = cur.left;
	    				pre.next = next;
	    				pre = next;
	    			}
	    		}
//	    			linkHelper(next_level_start, pre, next, cur.left);
	    		if(cur.right != null){
	    			if(next_level_start == null){
	    				next_level_start = cur.right;
	    				pre = cur.right;
	    			}
	    			else{
	    				next = cur.right;
	    				pre.next = next;
	    				pre = next;
	    			}
	    		}
//	    			linkHelper(next_level_start, pre, next, cur.right);
	    		cur = cur.next;
    		}
    		level_start = next_level_start;
    		next_level_start = null;
    	}
    }
    
    private void linkHelper(TreeLinkNode next_level_start, TreeLinkNode pre, TreeLinkNode next, TreeLinkNode target) {
		if(next_level_start == null){
			next_level_start = target;
			pre = target;
		}
		else{
			next = target;
			pre.next = next;
			pre = next;
		}
	}
}
