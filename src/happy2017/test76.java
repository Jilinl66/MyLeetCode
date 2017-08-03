package happy2017;

import java.util.HashMap;
import java.util.Map;

//76. Minimum Window Substring
public class test76 {
    public String minWindow(String s, String t) {
    	if(s.length() < t.length()) return "";
    	int minLen = Integer.MAX_VALUE;
    	String res = "";
    	Map<Character, Integer> map = new HashMap<>();
    	for(char c: t.toCharArray())
    		map.put(c, map.getOrDefault(c, 0) + 1);
    	int count = t.length();
    	int start = 0;
    	while(start < s.length() && !map.containsKey(s.charAt(start))) 
    		start++;
    	int end = start;
    	while(count > 0 && end < s.length()) {
    		char c = s.charAt(end);
			if(map.containsKey(c)) {
				if (map.get(c) > 0)
					count --;
				map.put(c, map.get(c) - 1);	
			}
			end++;
    	}
    	if(count > 0) return "";
    	minLen = Math.min(minLen, end - start);
    	res = s.substring(start, end);
    	end --;
    
    	while(end < s.length()) {
    		char cStart = s.charAt(start);
    		if(map.get(cStart) < 0) {
    			map.put(cStart, map.get(cStart) + 1);
    		}
    		else {
    			end ++;
    			while(end < s.length() && s.charAt(end) != cStart) {
    				if(map.containsKey(s.charAt(end)))
    					map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
    				end ++;
    			}
    			if(end == s.length()) break;
    		}
			start ++;
			while(start < end && !map.containsKey(s.charAt(start)))
				start ++;
    		if(end - start + 1 < minLen) {
    			minLen = end - start + 1;
    			res = s.substring(start, end + 1);
    		}
    	}
    	return res;
    }
}
