package happy2017;
//234. Palindrome Linked List
public class test234 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
        	slow = slow.next;
        	fast = fast.next.next;
        }
        if(fast != null)
        	slow = slow.next;
        ListNode rightHalf = reverse(slow);
        while(rightHalf != null){
        	if(rightHalf.val != head.val)
        		return false;
        	rightHalf = rightHalf.next;
        	head = head.next;
        }
        return true;
    }

	private ListNode reverse(ListNode head) {
		ListNode pre = null;
		while(head != null){
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}
