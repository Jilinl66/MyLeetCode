package happycoding2018;

public class Q24_SwapNodesInPairs {
	public class ListNode {
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        helper(pre, head);
        return pre.next;
    }
    
    private void helper(ListNode pre, ListNode p) {
        if (p == null || p.next == null) {
            return;
        }
        ListNode next = p.next;
        
        p.next = next.next;
        next.next = p;
        pre.next = next;
        
        pre = p;
        p = p.next;
        helper(pre, p);
    }
}
