package happy2017;

import java.util.Comparator;
import java.util.PriorityQueue;

//23. Merge k Sorted Lists
public class test23 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
        	@Override
        	public int compare(ListNode n1, ListNode n2) {
        		return n1.val - n2.val;
        	};
		});
        for(ListNode node: lists) {
        	if (node != null)
        		queue.offer(node);
        }
        ListNode dummy = new ListNode(0), curr = dummy;
        while(!queue.isEmpty()) {
        	curr.next = queue.poll();
        	curr = curr.next;
        	if(curr.next != null) {
        		queue.offer(curr.next);
        	}
        }
        return dummy.next;
    }
}

/**  LinkedIn Google Uber Airbnb Facebook Twitter Amazon Microsoft
 * 
 */