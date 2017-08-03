package happy2017;

import java.util.HashMap;
import java.util.Map;

//316. Remove Duplicate Letters
public class test316 {
    public String removeDuplicateLetters(String s) {
    	Map<Character, Integer> lastPosMap = new HashMap<>();
    	StringBuilder sBuilder = new StringBuilder();
    	for(int i = 0; i < s.length(); i++)
    		lastPosMap.put(s.charAt(i), i);
    	int len = lastPosMap.size();
    	int begin = 0, end = findMinLastPos(lastPosMap);
    	while(sBuilder.length() < len) {
    		char minChar = 'z' + 1;
	    	for(int k = begin; k <= end; k ++) {
	    		System.out.println(begin + " " + end);
	    		if(lastPosMap.containsKey(s.charAt(k)) && s.charAt(k) < minChar) {
	    			minChar = s.charAt(k);
	    			begin = k + 1;
	    		}
	    	}
	    	sBuilder.append(minChar);
	    	lastPosMap.remove(minChar);
	    	if(minChar == s.charAt(end)) {
	    		begin = end + 1;
	    		end = findMinLastPos(lastPosMap);
	    	}
    	}
    	return sBuilder.toString();
    }
    
    private int findMinLastPos(Map<Character, Integer> lastPosMap) {
    	if(lastPosMap == null || lastPosMap.isEmpty()) return -1;
    	int minLastPos = Integer.MAX_VALUE;
    	for(int pos: lastPosMap.values())
    		minLastPos = Math.min(minLastPos, pos);
    	return minLastPos;
    }
}

/** Google
 * Greedy
 */