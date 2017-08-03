package newToLeetcode;
//24. Swap Nodes in Pairs

public class test24 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode swapPairs(ListNode head) { 
		if(head == null || head.next == null)
			return head;
		ListNode dummy = head.next;
		head.next = swapPairs(dummy.next.next);
		dummy.next = head;
		return dummy;
	}
}
