package happy2017;

//19. Remove Nth Node From End of List
public class test19 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        int len = 0;
        for(len = 0; fast.next != null; len++)
        	fast = fast.next;
        for(int i = 0; i < len - n; i++)
        	slow = slow.next;
        slow.next = slow.next.next;
        return dummy.next;
    }
}
