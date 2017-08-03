package newToLeetcode;
//461. Hamming Distance
public class test461 {
	public static int hammingDistance(int x, int y) {
		int xor = x ^ y, count = 0;
		String s = Integer.toBinaryString(xor);
		for(int i = 0; i < s.length(); i++)
				count += (xor >> i) & 1;
		return count;
	}
}
