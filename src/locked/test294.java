package locked;

import java.util.HashMap;

//294. Flip Game II
public class test294 {
	public boolean canWin(String s) {
		if(s == null || s.length() < 2) return false;
		HashMap<String, Boolean> map = new HashMap<>();
		return helper(s, map);
	}
	
	public boolean helper(String s, HashMap<String, Boolean> map) {
		if(map.containsKey(s))
			return map.get(s);
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.startsWith("++", i)) {
				String newStr = s.substring(0, i) + "--" + s.substring(i + 2);
				if(!helper(newStr, map)) {
					map.put(s, true);
					return true;
				}
			}
		}
		map.put(s, false);
		return false;
	}
	
// Duplicate computation
//    public boolean canWin(String s) {
//        if(s == null || s.length() < 2) return false;
//        for (int i = 0; i < s.length() - 1; i++) {
//			if(s.startsWith("++", i)) { 
//				String newStr = s.substring(0, i) + "--" + s.substring(i + 2);
//				if(!canWin(newStr))
//					return true;
//			}
//		}
//        return false;
//    }
}

//Google
//Memorization