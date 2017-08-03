package happy2017;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//522. Longest Uncommon Subsequence II
public class test522 {
    public int findLUSlength(String[] strs) {
    	Map<String, Integer> substrFreq = new HashMap<>();
    	for(String s: strs)
    		for(String substr: getSubstring(s))
    			substrFreq.put(substr,substrFreq.getOrDefault(substr, 0) + 1);
    	int maxLen = -1;
    	for(Map.Entry<String, Integer> entry: substrFreq.entrySet())
    		if(entry.getValue() == 1)
    			maxLen = Math.max(entry.getKey().length(), maxLen);
    	return maxLen;
    }

	private Set<String> getSubstring(String s) {
		Set<String> set = new HashSet<>();
		if(s.length() == 0){
			set.add("");
			return set;
		}
		Set<String> recurSet = getSubstring(s.substring(1));
		for(String str: recurSet){
			set.add(str);
			set.add(s.charAt(0) + str);
		}
		return set;
	}
}