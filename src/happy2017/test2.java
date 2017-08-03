package happy2017;
//2. Add Two Numbers

public class test2 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		int sum = 0, carry = 0;
		while(l1 != null || l2 != null) {
			int val1 = l1 == null? 0: l1.val;
			int val2 = l2 == null? 0: l2.val;
			sum = val1 + val2 + carry;
			carry = sum/10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			if(l1 != null)
				l1 = l1.next;
			if(l2 != null)
				l2 = l2.next;
		}
		if(carry == 1)
			cur.next = new ListNode(1);
		return dummy.next;
	}

	//when list is very long???
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    	long num1 = 0, num2 = 0;
//    	ListNode dummy = new ListNode(0), cur = dummy;
//    	int i = 0;
//        while(l1 != null){
//        	num1 = (long) (Math.pow(10, i) * l1.val + num1);
//        	l1 = l1.next;
//        	i++;
//        }
//        i = 0;
//        while(l2 != null){
//        	num2 = (long) (Math.pow(10, i) * l2.val + num2);
//        	l2 = l2.next;
//        	i++;
//        }
//        long sum = num1 + num2;
//        System.out.println(num1);
//        System.out.println(num2);
//        if(sum == 0)
//        	return dummy;
//        while(sum != 0){
//        	cur.next = new ListNode((int) (sum % 10));
//        	sum /= 10;
//        	cur = cur.next;
//        }
//        return dummy.next;
//    }
}

/**
 *  Amazon Microsoft Bloomberg Airbnb Adobe
 */