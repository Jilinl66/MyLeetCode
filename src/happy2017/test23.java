package happy2017;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//23. Merge k Sorted Lists
public class test23 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	private static final Comparator<ListNode> listComparator= new Comparator<ListNode>() {
    	@Override
    	public int compare(ListNode o1, ListNode o2) {
    		return o1.val - o2.val;
    	}
	};
	
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists.length == 0) return null;
       Queue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, listComparator);
       for(ListNode node: lists)
    	   if(node != null)
    		   queue.add(node);
       ListNode dummy = new ListNode(0), p = dummy;
       while(!queue.isEmpty()){
    	   ListNode cur = queue.poll();
    	   p.next = cur;
    	   p = cur;
    	   if(cur.next != null)
    		   queue.add(cur.next);
       }
       return dummy.next;
    }
}
