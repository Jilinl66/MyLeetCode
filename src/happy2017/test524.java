package happy2017;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//524. Longest Word in Dictionary through Deleting
public class test524 {
//	public class sorting implements Comparator<String> {
//		public int compare(String s1, String s2) {
//			return s1.compareTo(s2);
//		}
//	}
    public String findLongestWord(String s, List<String> d) {
    	Map<Integer, String> map = new HashMap<>();
    	int maxLen = Integer.MIN_VALUE;
        for(String dicStr: d){
        	int len = dicStr.length();
        	int j = 0;
        	for(int i = 0; i < s.length() && j < len; i ++)
        		if(s.charAt(i) == dicStr.charAt(j))
        			j ++;
        	if(j == len){
        		maxLen = Math.max(maxLen, len);
        		if(map.get(len) == null)
        			map.put(len, dicStr);
        		if(dicStr.compareTo(map.get(len)) < 0)
        			map.replace(len, dicStr);
        	}
        }
//        Collections.sort(resList, new sorting());
        return maxLen == Integer.MIN_VALUE? "" : map.get(maxLen);
    }
}
