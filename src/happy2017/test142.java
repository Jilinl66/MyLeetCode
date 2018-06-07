package happy2017;

//142. Linked List Cycle II
public class test142 {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	 }
	 
	 public ListNode detectCycle(ListNode head) {
		 if(head == null || head.next == null) return null;
		 ListNode slow = head, fast = head;
		 while(fast != null && fast.next != null) {
			 fast = fast.next.next;
			 slow = slow.next;
			 if(fast == slow) break;
		 }
		 if(fast == null || fast.next == null) return null;
		 fast = head;
		 while(fast != slow) {
			 fast = fast.next;
			 slow = slow.next;
		 }
		 return slow;
	 }
}
