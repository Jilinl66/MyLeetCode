package happy2017;

//445. Add Two Numbers II
public class test445 {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int len1 = 0, len2 = 0, resLen = 0;
    	ListNode p1 = l1, p2 = l2;
        while(p1 !=  null){
        	len1 ++;
        	p1 = p1.next;
        }
        while(p2 !=  null){
        	len2 ++;
        	p2 = p2.next;
        }
        p1 = l1;
        p2 = l2;
        resLen = Math.max(len1, len2);
        int[] sums = new int[resLen];
        int[] carry = new int[resLen];
        for(int i = 0; i < resLen; i++){
        	int sum = 0;
        	if(i + len1 >= resLen){
        		sum += p1.val;
        		p1 = p1.next;
        	}
        	if(i + len2 >= resLen){
        		sum += p2.val;
        		p2 = p2.next;
        	}
        	sums[i] = sum % 10;
        	carry[i] = sum / 10;
        }
        for(int i = resLen - 2; i >= 0; i--){
        	int s = sums[i] + carry[i + 1];
        	sums[i] = s % 10;
        	carry[i] = carry[i] + s/10;
        }
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        if(carry[0] == 1){
        	p.next = new ListNode(1);
        	p = p.next;
        }
        for(int i = 0; i < resLen; i++){
        	p.next = new ListNode(sums[i]);
        	p = p.next;
        }
        return dummy.next;
    }
}
