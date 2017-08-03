package happy2017;
//409. Longest Palindrome
public class test409 {
    public int longestPalindrome(String s) {
    	int len = 0, oddCount = 0;
        int[] count = new int[52];
        for(char c: s.toCharArray()){
        	if(Character.isLowerCase(c))
        		count[c - 'a']++;
        	else
        		count[26 + c - 'A']++;
        }
        for(int i: count){
        	if(i % 2 == 1)
        		oddCount ++;
        	len += i;
        }
        return oddCount <= 1? len: len - oddCount + 1;
    }
}
