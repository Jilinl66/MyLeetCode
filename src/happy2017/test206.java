package happy2017;

import happy2017.test328.ListNode;

//206. Reverse Linked List
public class test206 {
//    public ListNode reverseList(ListNode head) {
//        ListNode newHead = null;
//        while(head != null){
//        	ListNode next = head.next;
//        	head.next = newHead;
//        	newHead = head;
//        	head = next;
//        }
//        return newHead;
//    }
	
	public ListNode reverseList(ListNode head) {
		return reverseList(head, null);
	}
	
	private ListNode reverseList(ListNode head, ListNode newHead) {
		if(head == null)
			return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return reverseList(next, head);
	}
}
