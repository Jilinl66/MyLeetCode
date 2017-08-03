package happy2017;

//86. Partition List
public class test86 {
	public class ListNode {
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
    public ListNode partition(ListNode head, int x) {
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode left = dummy, curr = head, pre = dummy;
    	while(curr != null) {
    		if(curr.val < x) {
    			if (curr == left.next) {
    				curr = curr.next;
    				pre = pre.next;
    			}
    			else {
	    			pre.next = curr.next;
	    			curr.next =  left.next;
	    			left.next = curr;
	    			curr = pre.next;
    			}
				left = left.next;
    		}
    		else {
    			curr = curr.next;
    			pre = pre.next;
    		}
    	}
    	return dummy.next;
    }
}
