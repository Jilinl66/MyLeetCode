package newToLeetcode;
//92. Reverse Linked List II

public class test92 {
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (m >= n - 2){
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy = head;
		int i = 1;
		ListNode node_m = null;
		ListNode node_n = null;
		while(head != null){
			if (i == m){
				node_m = head;
				head = head.next;
			}
			if (i == n - 1){
				node_n = head.next;
				break;
			}
			i ++;
		}
		reverseVal(node_m, node_n);
		reverseBetween(node_m, m + 1, n - 1); 
		return dummy.next;
    }

	private void reverseVal(ListNode a, ListNode b) {
		int temp = a.val;
		a.val = b.val;
		b.val = temp; 
	}
      
}
