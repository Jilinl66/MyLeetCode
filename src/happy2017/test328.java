package happy2017;
//328. Odd Even Linked List
public class test328 {
	public class ListNode {
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
    public ListNode oddEvenList(ListNode head) {
    	if(head == null || head.next == null) return head;
    	ListNode slow = head, fast = head.next;
    	while(fast != null && fast.next != null) {
    		ListNode temp = fast.next.next;
    		fast.next.next = slow.next;
    		slow.next = fast.next;
    		fast.next = temp;
    		slow = slow.next;
    		fast = fast.next;
    	}
    	return head;
    }
}
