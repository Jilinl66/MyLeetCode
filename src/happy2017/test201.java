package happy2017;

import java.util.HashSet;
import java.util.Set;

//201. Bitwise AND of Numbers Range
public class test201 {
	public int rangeBitwiseAnd(int m, int n) {
		 if(m == 0) return 0;
		 int moveFactor = 1;
		 while(m != n){
			 m >>= 1;
			 n >>= 1;
			 moveFactor <<= 1;
		 }
		 return m * moveFactor;
	}
//	public int rangeBitwiseAnd(int m, int n) {
//		Set<Integer> set = new HashSet<>();
//		int res = 0;
//		for(int i = 0; i < 32; i++)
//			set.add(i);
//		for(int i = m; i <= n; i++){
//			for(int j = 0; j < 32; j++)
//				if ((m >> j) == 0)
//					set.remove(j);
//				if(set.isEmpty()) return 0;
//		}
//		for(int idx: set)
//			res |= (1 << idx);
//		return res;
//	}
//    public int rangeBitwiseAnd(int m, int n) {
//        int res = 0;
//        for(int i = 0; i < 32; i++){
//        	int bit = 1;
//        	for(int j = m; j <= n; j++){
//        		if(bit == 0) break;
//        		bit = (((j >> i) & 1) == 1) ? 1: 0;
//        	}
//        	res |= bit << i;
//        }
//        return res;
//    }
}
