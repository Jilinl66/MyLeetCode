package happy2017;
//242. Valid Anagram
public class test242 {
    public boolean isAnagram(String s, String t) {
    	int[] count = new int[26];
    	if(s.length() != t.length()) return false;
    	for(int i = 0; i < s.length(); i++) {
    		count[s.charAt(i) - 'a']++;
    		count[t.charAt(i) - 'a']--;
    	}
    	for (int i = 0; i < count.length; i++)
			if(count[i] != 0) return false;
		return true;
    }
}
