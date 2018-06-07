package happy2017;
//92. Reverse Linked List II

public class test92 {
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = head, preCurr = dummy;
		int i = m - 1;
		while(i-- > 0) {
			preCurr = preCurr.next;
			curr = curr.next;
		}
		i = n - m;
		while(i-- > 0) {
			ListNode next = curr.next;
			curr.next = next.next;
			next.next = preCurr.next;
			preCurr.next = next;
		}
		return dummy.next;
	}
	
}
