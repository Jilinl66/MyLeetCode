package newToLeetcode;
//49. Group Anagrams
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test49 {
	public List<List<String>> groupAnagrams(String[] strs) {
	    if (strs.length == 0 || strs == null) return new ArrayList<List<String>>();
	    Map<String, List<String>> map = new HashMap<String, List<String>>();
	    Arrays.sort(strs);
	    for (String s:strs){
	    	char[] charArr = s.toCharArray();
	    	Arrays.sort(charArr);
	    	String keystr = String.valueOf(charArr);
	    	if (!map.containsKey(keystr)){
	    		map.put(keystr, new ArrayList<String>());
	    	}
    		map.get(keystr).add(s);
	    }
	    return new ArrayList<List<String>>(map.values());
	}
}
