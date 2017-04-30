package happy2017;
//2. Add Two Numbers

public class test2 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
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
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode n1 = l1;
		ListNode n2 = l2;
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		int sum = 0;
		while(n1 != null || n2 != null){
			if(n1 != null){
				sum += n1.val;
				n1 = n1.next;
			}
			if(n2 != null){
				sum += n2.val;
				n2 = n2.next;
			}
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			sum /= 10;
		}
		if(sum != 0)
			cur.next = new ListNode(sum);
		return dummy.next;
	}
}
