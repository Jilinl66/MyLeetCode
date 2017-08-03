package happy2017;

//234. Palindrome Linked List
public class test234 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public boolean isPalindrome(ListNode head) {
    	if(head == null || head.next == null) return true;
    	int count = 0;
    	ListNode curr = head;
    	while(curr != null) {
    		count ++;
    		curr = curr.next;
    	}
    	curr = head;
    	for(int i = 0; i < count/2; i++)
    		curr = curr.next;
    	ListNode tail = reverse(curr, null);
    	ListNode p1 = head, p2 = tail;
    	while(p1 !=  null && p2 != null) {
    		if(p1.val != p2.val)
    			return false;
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	return true;
    }

	private ListNode reverse(ListNode head, ListNode pre) {
		ListNode next = head.next;
		head.next = pre;
		if(next == null) return head;
		ListNode root = reverse(next, head);
		return root;
	}
}
