package happy2017;

import java.util.HashMap;
import java.util.Map;

//316. Remove Duplicate Letters
public class test316 {
	public String removeDuplicateLetters(String s) {
	if(s == null || s.length() <= 1) return s;
		Map<Character, Integer> lastPos = new HashMap<>();
		for(int i = 0; i < s.length(); i++)
			lastPos.put(s.charAt(i), i);
		char[] result = new char[lastPos.size()];
		int begin = 0, end = findMinLastPos(lastPos);
		for(int i = 0; i < result.length; i++){
			char minChar = 'z' + 1;      
			 for(int k = begin; k <= end; k++){
				 char cur = s.charAt(k);
				 if(lastPos.containsKey(cur) && cur < minChar){
					 minChar = cur;
					 begin = k + 1;
				 }
			 }
			 result[i] = minChar;
			 lastPos.remove(minChar);
			 if(minChar == s.charAt(end))
				 end = findMinLastPos(lastPos);
		}
		return String.valueOf(result);
 	}
	private int findMinLastPos(Map<Character, Integer> map){
		if(map.size() == 0 || map == null) return -1;
		int min = Integer.MAX_VALUE;
		for(int pos: map.values())
			min = Math.min(min, pos);
		return min;
	} 
//    public String removeDuplicateLetters(String s) {
//        int[] cnt = new int[26];
//        int pos = 0;
//        for(int i = 0; i< s.length(); i++)
//        	cnt[s.charAt(i) - 'a']++;
//        for(int i = 0; i < s.length(); i++){
//        	if(s.charAt(i) < s.charAt(pos))
//        		pos = i;
//        	if(--cnt[s.charAt(i) - 'a'] == 0)
//        		break;
//        }
//        return s.length() == 0? "": s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replace(String.valueOf(s.charAt(pos)), ""));
//    }
}
