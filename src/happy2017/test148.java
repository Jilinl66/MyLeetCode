package happy2017;

//148. Sort List
public class test148 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head, pre = slow;
        while(fast != null && fast.next != null) {
        	pre = slow;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        pre.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        ListNode newHead = merge(l1, l2);
        return newHead;
    } 
    
    private ListNode merge(ListNode n1, ListNode n2) {
		ListNode dummy = new ListNode(0);
		ListNode p = dummy;
		while(n1 != null && n2 != null) {
			if(n1.val < n2.val) {
				p.next = n1;
				n1 = n1.next;
			}
			else{
				p.next = n2;
				n2 = n2.next;
			}
			p = p.next;
		}
		if(n1 != null)
			p.next = n1;
		if(n2 != null)
			p.next = n2;
		return dummy.next;
	}
}
