package happy2017;

//61. Rotate List
public class test61 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
    public ListNode rotateRight(ListNode head, int k) {
    	if(head == null) return head;
    	int count = 0;
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode fast = dummy;
    	while(fast.next != null) {
    		fast = fast.next;
    		count ++;
    	}
    	if(k == 0) return head;
    	ListNode curr = dummy;
    	for(int i = 0; i < count - k % count; i++) {
    		curr = curr.next;
    	}
    	fast.next = dummy.next;
    	dummy.next = curr.next;
    	curr.next = null;
    	return dummy.next;
    }
}