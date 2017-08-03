package happy2017;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//205. Isomorphic Strings
public class test205 {
	public boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) return false;
		Map<Character, Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)) {
				if(!set.add(t.charAt(i)))
					return false;
				map.put(c, t.charAt(i));
			}
			else if(map.get(c) != t.charAt(i))
				return false;
		}
		return true;
	}
	
	
	
	
	
	
//	if-else 就近匹配
//	public boolean isIsomorphic(String s, String t) {
//		return helper(s, t) && helper(t, s);
//	}
//    public boolean helper(String s, String t) {
//        Map<Character, Character> map = new HashMap<>();
//        if(s.length() != t.length()) return false;
//        for(int i = 0; i < s.length(); i ++){
//        	if(map.containsKey(s.charAt(i))){
//        		if(map.get(s.charAt(i)) != t.charAt(i))
//        			return false;
//        	}
//        	else{
//        		map.put(s.charAt(i), t.charAt(i)); 
//        		System.out.println(s.charAt(i) + " " + t.charAt(i));
//        	}
//        }
//        return true;
//    }
}
