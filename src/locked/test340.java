package locked;

import java.util.HashMap;

//340. Longest Substring with At Most K Distinct Characters
public class test340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
    	if(k == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int maxLen = 0;
        int start = 0;
        for(int end = 0; end < s.length(); end++) {
        	char c = s.charAt(end);
    		map.put(c, map.getOrDefault(c, 0) + 1);
			if(map.get(c) == 1)
				count++;
			while(count > k) {
				char c2 = s.charAt(start++);
				map.put(c2, map.get(c2) - 1);
				if(map.get(c2) == 0)
					count--;
			}
        	maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
