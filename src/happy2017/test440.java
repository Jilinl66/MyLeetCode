package happy2017;

//440. K-th Smallest in Lexicographical Order
//Hard!
public class test440 {
	public int findKthNumber(int n, int k) {
		int curr = 1;
		k--;
		while(k > 0) {
			int steps = calNextSteps(n, curr);
			if(steps <= k) {
				k -= steps;
				curr ++;
			}
			else {
				curr *= 10;
				k--;
			}
		}
		return curr;
	}
	
	private int calNextSteps(int n, int curr) {
		int steps = 0;
		long n1 = curr, n2 = curr + 1;
		while(n1 <= n) {
			steps += Math.min(n + 1, n2) - n1;
			n1 *= 10;
			n2 *= 10;
		}
		return steps;
	}
//    public int findKthNumber(int n, int k) {
//    	long curr = 1;
//    	while(--k > 0){
//        	if(curr * 10 <= n)
//        		curr *= 10;
//        	else if(curr % 10 != 9 && curr + 1 <= n)
//        		curr ++;
//        	else {
//        		while((curr / 10) % 10 == 9)
//        			curr /= 10;
//        		curr = curr/10 + 1;	
//        	}
//        }
//    	return (int)curr;
//    }
}
