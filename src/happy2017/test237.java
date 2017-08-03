package happy2017;

import happy2017.test328.ListNode;

//237. Delete Node in a Linked List
public class test237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;   
    }
}
