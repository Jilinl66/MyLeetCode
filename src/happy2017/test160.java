package happy2017;

import happy2017.test19.ListNode;

//160. Intersection of Two Linked Lists
public class test160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode nodeA = headA, nodeB = headB;
        while(nodeA != nodeB) {
        	nodeA = (nodeA == null ? headB : nodeA.next);
        	nodeB = (nodeB == null ? headA: nodeB.next);
        }
        return nodeA;
    }
}
