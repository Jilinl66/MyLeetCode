package happy2017;
//82. Remove Duplicates from Sorted List II

public class test82 {
	public class ListNode {
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
    public ListNode deleteDuplicates(ListNode head) {
    		  if (head == null)
    			  return head;
          ListNode dummy = new ListNode(0);
          dummy.next = head;
	  	  ListNode pre = dummy;
	  	  ListNode curr = head;
          while(curr != null && curr.next != null) {
        	  		if(curr.val == curr.next.val) {
        	  			int val = curr.val;
        	  				while(curr != null && curr.val == val) {
        	  					pre.next = pre.next.next;
        	  					curr = pre.next;
        	  				}
        	  		}
        	  		else {
        	  			pre = pre.next;
        	  			curr = curr.next;
        	  		}
          }
          return dummy.next;
    }
}

