package locked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//249. Group Shifted Strings
public class test249 {
	//Hashmap method
	 public List<List<String>> groupStrings(String[] strings) {
		 List<List<String>> res = new ArrayList<>();
		 HashMap<String, List<String>> map = new HashMap<>();
		 for(String str: strings) {
			int offset = str.charAt(0) - 'a';
			String key = "";
			for(int i = 0; i < str.length(); i++) {
				char c = (char) ((str.charAt(i) - offset + 26) % 26);
				key += c;
			}
			if(!map.containsKey(key)) {
				ArrayList<String> newList = new ArrayList<>();
				map.put(key, newList);
			}
			map.get(key).add(str);
		 }
		 for(String s: map.keySet()) 
			 res.add(map.get(s));
		 return res;
	 }
	 
	 
//    public List<List<String>> groupStrings(String[] strings) {
//    	List<List<String>> res = new ArrayList<>();
//    	for (int i = 0; i < strings.length; i++) {
//    		int j = 0;
//    		String curStr = strings[i];
//    		for(j = 0; j < res.size(); j++) {
//    			String target = res.get(j).get(0); 
//        		if (curStr.length() != target.length())
//        			continue;
//        		if(samePattern(curStr, target)) {
//        			res.get(j).add(curStr);
//        			break;
//        		}
//        	}
//    		if(j == res.size()) {
//    			List<String> newList = new ArrayList<>();
//    			newList.add(curStr);
//    			res.add(newList);
//    		}
//		}
//    	return res;
//    }
//    
//    public boolean samePattern(String s1, String s2) {
//		for (int i = 1; i < s1.length(); i++) {
//			if((s1.charAt(i) - s1.charAt(i - 1) + 26) % 26 !=  (s2.charAt(i) - s2.charAt(i - 1) + 26) % 26)
//				return false;
//		}
//		return true;
//	}
}

//Google, Uber