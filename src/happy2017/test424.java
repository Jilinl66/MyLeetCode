package happy2017;
//424. Longest Repeating Character Replacement
public class test424 {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int start = 0, maxLen = 0, maxCount = 0;
        for(int end = 0; end < s.length(); end ++){
        	count[s.charAt(end) - 'A']++;
        	maxCount = Math.max(maxCount, count[s.charAt(end) - 'A']);
        	while(end - start + 1 - maxCount > k)
        		count[s.charAt(start++) - 'A']--;
        	maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
