package happy2017;
///5. Longest Palindromic Substring
public class test5 {
	int i = 0, maxLen = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2)
        	return s;
        for(int i = 0; i < len; i++){
        	extendPalindrome(s, i, i);
        	extendPalindrome(s, i, i + 1);
        }
        return s.substring(i, i + maxLen);
    }
    
    private void extendPalindrome(String str, int start, int end) {
		while(start >=0 && end < str.length() && str.charAt(start) == str.charAt(end)){
			start--;
			end ++;
    	}
		int newLen = end - start - 1;
		if(maxLen < newLen){
			i = start + 1;
			maxLen = newLen;
		}
	}
}
