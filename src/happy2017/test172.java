package happy2017;
//172. Factorial Trailing Zeroes
public class test172 {
	public int trailingZeroes(int n) {
		return n == 0? 0: n / 5 + trailingZeroes(n/5);
	}
//	int numOfTwo = 0, numOfFive = 0;
//	Memory Limit Exceeded
//	public int trailingZeroes(int n) {
//		int[] array = new int[n + 1];
//		array[0] = 1;
//		if(n > 0)
//			array[1] = 0;
//		for(int i = 2; i <= n; i ++){
//			int twos = 0, fives = 0;
//			int cur = i;
//			while(cur % 5 == 0){
//	       		fives ++;
//	       		cur /= 5;
//			}
//			while(cur % 2 == 0){
//				twos ++;
//				cur /= 2;
//			}
//			numOfTwo += twos;
//			numOfFive += fives;
//			int add = Math.min(numOfTwo, numOfFive);
//			array[i] = array[i - 1] + add;
//			numOfFive -= add;
//			numOfTwo -= add;
//			System.out.println(array[i]);
//		}
//		return array[n];
//	}
	
//	Stack overflow
//	public int trailingZeroes(int n) {
//    	int cur = n;
//    	if(cur == 0) return 1;
//    	if(cur == 1) return 0;
//    	int twos = 0, fives = 0;
//      while(cur % 5 == 0){
//       		fives ++;
//       		cur /= 5;
//		}
//		while(cur % 2 == 0){
//			twos ++;
//			cur /= 2;
//		}
//		numOfTwo += twos;
//		numOfFive += fives;
//		int add = Math.min(numOfTwo, numOfFive);
//		numOfFive -= add;
//		numOfTwo -= add;
//		return trailingZeroes(n - 1) + add; 
//	}
}
