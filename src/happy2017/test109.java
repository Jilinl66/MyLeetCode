package happy2017;

//109. Convert Sorted List to Binary Search Tree
public class test109 {
	public class ListNode {
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return convertToBST(head);
    }
    
    private TreeNode convertToBST(ListNode head) {
    	if(head == null) return null;
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode pre = dummy, p1 = head, p2 = head;
    	while(p2.next != null && p2.next.next != null) {
    		pre = p1;
    		p1 = p1.next;
    		p2 = p2.next.next;
    	}
    	TreeNode root = new TreeNode(p1.val);
    	pre.next = null;
    	root.left = convertToBST(dummy.next);
    	root.right = convertToBST(p1.next);
    	return root;
    }
}
