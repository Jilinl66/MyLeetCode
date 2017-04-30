package locked;


//369. Plus One Linked List
public class test369 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public ListNode plusOne(ListNode head) {
        ListNode newHead = reverse(head);
        ListNode dummy = new ListNode(0);
        dummy.next = newHead;
        int carry = 1;
        while(newHead != null && carry == 1) {
        	int sum = newHead.val + carry;
        	carry = sum > 9? 1: 0; 
        	newHead.val = sum % 10;  
        	newHead = newHead.next;
        }
        if(newHead == null && carry == 1) {
        	ListNode ret = new ListNode(1);
        	ret.next = reverse(dummy.next);
        	return ret;
        }
        return reverse(dummy.next);
    }
    
    private ListNode reverse(ListNode head) {
    	if(head.next == null) return head;
    	ListNode node = reverse(head.next);
    	head.next.next = head;
    	head.next = null;
    	return node;
    }
 }
