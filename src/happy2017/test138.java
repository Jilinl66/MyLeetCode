package happy2017;
//138. Copy List with Random Pointer
public class test138 {
	class RandomListNode {
		 int label;
		 RandomListNode next, random;
		 RandomListNode(int x) { this.label = x; }
	}
	
    public RandomListNode copyRandomList(RandomListNode head) {
    	if(head == null) return null;
    	RandomListNode curr = head, next;
    	while(curr != null) {
    		next = curr.next;
    		RandomListNode copy = new RandomListNode(curr.label);
    		curr.next = copy;
    		copy.next = next;
    		curr = next;
    	}
    	
    	curr = head;
    	while(curr != null) {
    		next = curr.next.next;
    		if(curr.random != null)
    			curr.next.random = curr.random.next;
    		if(next.next != null)
    			curr.next.next = next.next;
    		curr = next;    		
    	}
    	
    	curr = head;
    	RandomListNode dummy = new RandomListNode(0);
    	RandomListNode copy, copyIter = dummy;
    	while(curr != null) { 
    		next = curr.next.next;
    		copy = curr.next;
    		copyIter.next = copy;
    		copyIter = copy;
    		curr.next = next;
    		curr = next;
    	}
    	return dummy.next;
    }
}


/** Amazon Microsoft Bloomberg Uber
 *  Hash Table
 */

