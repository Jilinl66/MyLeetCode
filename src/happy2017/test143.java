package happy2017;

import happy2017.test234.ListNode;

//143. Reorder List
public class test143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
        	return;
        ListNode n1 = head;
        ListNode n2 = head;
        while(n2.next != null && n2.next.next != null){
        	n1 = n1.next;
        	n2 = n2.next.next;
        }
        ListNode premid = n1;
        ListNode precur = n1.next;
        while(precur.next != null){
        	ListNode cur = precur.next;
        	precur.next = cur.next;
        	cur.next = premid.next;
        	premid.next = cur;
        }
        n1 = head;
        n2 = premid.next;
        while(n1 != premid){
        	premid.next = n2.next;
        	n2.next = n1.next;
        	n1.next = n2;
        	n1 = n1.next.next;
        	n2 = premid.next;
        }
    }
}
