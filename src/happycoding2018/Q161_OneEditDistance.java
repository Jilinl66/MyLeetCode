package happycoding2018;

public class Q161_OneEditDistance {
	public static void main(String[] args) {
		System.out.println(isOneEditDistance("", "abc"));
	}
	
	public static boolean isOneEditDistance(String s, String t) {
		int lenS = s.length();
		int lenT = t.length();
		if (Math.abs(lenS - lenT) > 1) {
			return false;
		}
		int iS = 0, iT = 0;
		int diffCount = 0;
		while(iS < lenS && iT < lenT) {
			if (s.charAt(iS) != t.charAt(iT)) {
				if (diffCount == 1) {
					return false;
				}
				diffCount ++;
				if (lenS == lenT) {
					iS ++;
					iT ++;
				} else if (lenS > lenT) {
					iS ++;
				} else {
					iT ++;					
				}
			} else {
				iS ++;
				iT ++;
			}
		} 
		return true;
	}
}
