package newToLeetcode;

//142. Linked List Cycle II
public class test142 {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	 }
	 
	 public ListNode detectCycle(ListNode head) {
	        if (head == null || head.next == null) return null;
	        ListNode fastNode = head, slowNode = head;
	        while(fastNode != null && fastNode.next.next != null){
	        	slowNode = slowNode.next;
	        	fastNode = fastNode.next.next;
	        	if (slowNode == fastNode){
	        		while(slowNode != head){
	        			slowNode = slowNode.next;
	        			head = head.next;
	        		}
	        		return head;
	        	}
	        }
	        return null;
	    }
}
