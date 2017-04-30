package newToLeetcode;
//147. Insertion Sort List
public class test147 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        //dummy.next = head;
        ListNode current = head, next = null, front = dummy;
        while(current!= null){
        	next = current.next;
	        front = dummy;
        	while(front.next.val <current.val && front.next != current){
        		front = front.next;
        	}	 
	        current.next = front.next;
	        front.next = current;
	        current = next;
        }
        return dummy.next;
    }
}
