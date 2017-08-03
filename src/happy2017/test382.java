package happy2017;

import java.util.Random;

public class test382 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	ListNode head;
	Random random;
	
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public test382(ListNode head) {
        this.head = head;
        random = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
    	int count = 0;
        ListNode curr = head;
        int ret = curr.val;
        while(curr != null) {
        	if(random.nextInt(count + 1) == count)
        		ret = curr.val;
        	curr = curr.next;
        	count ++;
        }
        return ret;
    }
}
