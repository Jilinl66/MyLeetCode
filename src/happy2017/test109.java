package happy2017;

import happy2017.test328.ListNode;

//109. Convert Sorted List to Binary Search Tree
public class test109 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
        	return null;
        return toBST(head, null);
    }
    
    private TreeNode toBST(ListNode head, ListNode tail) {
		ListNode slow = head;
		ListNode fast = head;
		if(head == tail)
			return null;
		while(fast != tail && fast.next != tail){
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeNode trHead = new TreeNode(slow.val);
		trHead.left = toBST(head, slow);
		trHead.right = toBST(slow.next, tail);
		return trHead;
    }
}
