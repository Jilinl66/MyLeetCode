package happy2017;


//83. Remove Duplicates from Sorted List
public class test83 {	
	public class ListNode {
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
        while(head != null && head.next != null){
        	while(head.next !=null && head.next.val == head.val){
        		head.next = head.next.next;
        	}
        	head = head.next;
        }
        return dummy.next;
    }
}
