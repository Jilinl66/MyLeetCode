package happy2017;

import java.util.HashMap;
import java.util.Map;

//76. Minimum Window Substring
public class test76 {
    public String minWindow(String s, String t) {
    	String res = "";
    	if(s.isEmpty() || t.isEmpty()) return res;
    	Map<Character, Integer> map = new HashMap<>();
    	for(char c: t.toCharArray())
    		map.put(c, map.getOrDefault(c, 0) + 1);
    	
    	int left = 0, minleft = 0, minlen = s.length() + 1, count = 0;
    	for(int right = 0; right < s.length(); right++){
    		char curCh = s.charAt(right);
    		if(map.containsKey(curCh)){
    			map.put(curCh, map.get(curCh) - 1);
        		if(map.get(curCh) >= 0)
        			count ++;
        		
        		while(count == t.length()){
        			int newLen = right - left + 1;
        			if(newLen <	minlen){
        				minlen = newLen;
        				minleft = left;
        			}
        			curCh = s.charAt(left);
        			if(map.containsKey(curCh)){
        				map.put(curCh, map.get(curCh) + 1);
        				if(map.get(curCh) > 0)
        					count --;
        			}
        		left ++;
        		}	
    		}
    	}
    	if(minlen > s.length())
    		return "";
    	return s.substring(minleft, minleft + minlen);
    }
}
