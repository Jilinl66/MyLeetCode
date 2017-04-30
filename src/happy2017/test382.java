package happy2017;

public class test382 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}

	ListNode head;
	
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public test382(ListNode head) {
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
    	ListNode cur = head;
        int rand = head.val;
        for(int i = 1; cur.next != null; i++){
        	cur = cur.next;
        	if((int) (Math.random() * (i + 1)) == i)
        		rand = cur.val;
        }
        return rand;
    }
}
