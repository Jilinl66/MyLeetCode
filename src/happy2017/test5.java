package happy2017;

///5. Longest Palindromic Substring
public class test5 {
	int maxLen;
	String resStr;
    public String longestPalindrome(String s) {
    	if(s.length() < 2) return s;
    	for(int i = 0; i < s.length() - 1; i++) {
        	extendPalindrome(s, i, i);
        	extendPalindrome(s, i, i + 1);
    	}
    	return resStr; 
    }
    
    private void extendPalindrome(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			 left--;
			 right++;
		}
		int newLen = right - left - 1;
		if(maxLen < newLen) {
			maxLen = newLen;
			resStr = s.substring(left + 1, right);
		}
	}
}

/** Amazon Microsoft Bloomberg
 * The above approach is O(n2)
 * Approach #5 (Manacher's Algorithm) [Accepted] O(n)
 */