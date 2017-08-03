package happy2017;

//19. Remove Nth Node From End of List
public class test19 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head == null) return null;
    	int count = 0;
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	while(head != null) {
    		count++;
    		head = head.next;
    	}
    	int k = count - n;
    	head = dummy;
    	while(k-- > 0)
    		head = head.next;
    	head.next = head.next.next;
    	return dummy.next;
    }
}
