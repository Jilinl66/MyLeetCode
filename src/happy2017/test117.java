package happy2017;

//117. Populating Next Right Pointers in Each Node II
public class test117 {
	public class TreeLinkNode {
		 int val;
		 TreeLinkNode left, right, next;
		 TreeLinkNode(int x) { val = x; }
	}
	
    public void connect(TreeLinkNode root) {
    	if(root == null) return;
    	TreeLinkNode pre = root;
    	TreeLinkNode curr = null;
    	while(findNextParent(pre) != null) {
    		curr = null;
    		TreeLinkNode first = null;
    		while((pre = findNextParent(pre)) != null) {
    			if(pre.left != null) {
    				if(curr != null) {
    					curr.next = pre.left;
    				}
    				else {
    					first = pre.left;
    				}
    				if(pre.right != null) {
    					pre.left.next = pre.right;
    					curr = pre.right;
    				}
    				else {
    					curr = pre.left;    					
    				}
    			}
    			else {
    				if(curr != null)
    					curr.next = pre.right;
    				else
    					first = pre.right;
    				curr = pre.right;
    			}
    			pre = pre.next;
    		}
    		pre = first;
    	}
    }
    
    private TreeLinkNode findNextParent(TreeLinkNode pre) {
		while(pre != null) {
    		if(pre.left != null || pre.right != null) return pre;
    		pre = pre.next;
		}
		return null;
	}
}
