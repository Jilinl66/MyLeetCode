package happy2017;
//138. Copy List with Random Pointer
public class test138 {
	class RandomListNode {
		 int label;
		 RandomListNode next, random;
		 RandomListNode(int x) { this.label = x; }
	}
	
    public RandomListNode copyRandomList(RandomListNode head) {
    		RandomListNode iter = head, next;
        	while(iter != null){
        		next = iter.next;
        		RandomListNode copy = new RandomListNode(iter.label);
        		iter.next = copy;
        		copy.next = next;
        		iter = next;
        	}
        	iter = head;
        	while(iter != null){
        		if(iter.random != null)
        			iter.next.random = iter.random.next;
        		iter = iter.next.next;
        	}
        	iter = head;
        	RandomListNode dummy = new RandomListNode(0);
        	RandomListNode copy, copyIter = dummy;
        	while(iter != null){
        		next = iter.next.next;
        		copy = iter.next;
        		copyIter.next = copy;
        		copyIter = copy;
        		iter.next = next;
        		iter = next;
        	}
        	return dummy.next;
    }
}
