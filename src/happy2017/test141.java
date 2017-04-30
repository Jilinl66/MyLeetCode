package happy2017;

import happy2017.test19.ListNode;

//141. Linked List Cycle
public class test141 {
    public boolean hasCycle(ListNode head) {
       if(head == null) return false;
       ListNode slow = head;
       ListNode fast = head;
       while(fast.next != null && fast.next.next != null){
    	   slow = slow.next;
    	   fast = fast.next.next;
    	   if(slow == fast) return true;
       }
       return false;
    }
 }
