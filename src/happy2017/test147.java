package happy2017;
//147. Insertion Sort List
public class test147 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode insertionSortList(ListNode head) {
		ListNode dummy = new ListNode(0), curr = head, pre = dummy;
		dummy.next = head;
		while(curr != null) {
			ListNode insert = dummy;
			while(insert.next != curr && curr.val > insert.next.val)
				insert = insert.next;
			if(insert.next != curr) {
				pre.next = curr.next;
				curr.next = insert.next;
				insert.next = curr;
				curr = pre.next;
			}
			else { 
				pre = curr;
				curr = curr.next;
			}
		}
		return dummy.next;
	}
}

/** LinkedList Insertion Sort
 * 
 */