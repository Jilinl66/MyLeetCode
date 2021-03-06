package happy2017;

//203. Remove Linked List Elements
public class test203 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head;
        while(cur != null){
        	if(cur.val == val)
        		pre.next = pre.next.next;
        	else
        		pre = pre.next;
        	cur = pre.next;
        }
        return dummy.next;
    }
}