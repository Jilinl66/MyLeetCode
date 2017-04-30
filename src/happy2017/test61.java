package happy2017;

//61. Rotate List
public class test61 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        int len = 0;
        for(len = 0; fast.next != null; len++)
        	fast = fast.next;
        // get the len-k node
        for(int i = 0; i < len - k%len; i++)
        	slow = slow.next;
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;
    }
}