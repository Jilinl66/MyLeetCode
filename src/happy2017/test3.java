package happy2017;

import java.util.HashMap;

//3. Longest Substring Without Repeating Characters
public class test3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxLen = 0;
        char[] chars = s.toCharArray();
        while(right < s.length()) {
        	char c = chars[right];
        	if(map.containsKey(c) && map.get(c) >= left) // second AND condition!
        		left = map.get(c) + 1;
        	maxLen = Math.max(maxLen, right - left + 1);
        	map.put(c, right);
    		right ++;
        }
        return maxLen;
    }
}

/** 
 * Amazon Adobe Bloomberg Yelp
 * Hash Table Two Pointers String
 */
