package happy2017;
//328. Odd Even Linked List
public class test328 {
	public class ListNode {
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
    public ListNode oddEvenList(ListNode head) {
    	if(head == null)
    		return head;
    	ListNode odd = head;
        ListNode even = head.next, evenHead = even;
        while(even != null && even.next != null){                                                     
        	odd.next = odd.next.next;
        	even.next = even.next.next;
        	odd = odd.next;
        	even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
