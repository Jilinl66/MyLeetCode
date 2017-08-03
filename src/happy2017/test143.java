package happy2017;

import happy2017.test234.ListNode;

//143. Reorder List
public class test143 {
    public void reorderList(ListNode head) {
    	if(head == null || head.next == null) return;
    	ListNode p1 = head, p2 = head;
    	while(p2.next != null && p2.next.next != null) {
    		p1 = p1.next;
    		p2 = p2.next.next;
    	}
    	ListNode preMid = p1;
    	ListNode preCur = p1.next;
    	while(preCur.next != null) {
    		ListNode curr = preCur.next;
    		preCur.next = curr.next;
    		curr.next = preMid.next;
    		preMid.next = curr;
    	}
    	p2 = preMid.next;
    	p1 = head;
    	while(p1 != preMid) {
    		preMid.next = p2.next;
    		p2.next = p1.next;
    		p1.next = p2;
    		p1 = p1.next.next;
    		p2 = preMid.next;
    	}
    }
}
