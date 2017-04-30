package happy2017;

import java.util.HashMap;
import java.util.Map;

//205. Isomorphic Strings
public class test205 {
	public boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) return false;
		int[] array1 = new int[256];
		int[] array2 = new int[256];
		for(int i = 0; i < s.length(); i++){
			System.out.println(array1[s.charAt(i)] + " " + array2[t.charAt(i)]);
			if(array1[s.charAt(i)] != array2[t.charAt(i)]) return false;
			array1[s.charAt(i)] = i;
			array2[t.charAt(i)] = i;
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
