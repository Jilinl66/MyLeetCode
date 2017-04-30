package happy2017;
//242. Valid Anagram
public class test242 {
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) return false;
    	char[] c_array = new char[26];
        for(int i = 0; i < s.length(); i++)
        	c_array[s.charAt(i) - 'a'] ++;
        for(int i = 0; i < t.length(); i++)
        	c_array[t.charAt(i) - 'a'] --;
        for(int i = 0; i < 26; i++)
        	if(c_array[i] != 0)
        		return false;
        return true;
    }
}
