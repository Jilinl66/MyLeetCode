package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
//hard!
//140. Word Break II
public class test140 {
	  public List<String> wordBreak(String s, List<String> wordDict) {
		return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());  
	  }
	  
	  private List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>> map) {
		if(map.containsKey(s))
			return map.get(s);
		LinkedList<String> res = new LinkedList<>();
		if(s.length() == 0) {
			res.add("");
			return res;
		}
		for(String word: wordDict) {
			if(s.startsWith(word)) {
				List<String> sublist = DFS(s.substring(word.length()), wordDict, map);
				for(String sub: sublist) {
					res.add(word + (sub.length() == 0? "": " ") + sub);
				}
			}
		}
		map.put(s, res);
		return res;
	}
	  
//    public List<String> wordBreak(String s, List<String> wordDict) {
//    	List<String> res = new ArrayList<>();
//    	DFS(res, "", s, wordDict, 0);
//    	return res;
//    }
//    
//    private void DFS(List<String> res, String newStr, String s, List<String> wordDict, int pos) {
//    	if(pos == s.length())
//    		res.add(newStr.trim());
//		for(int i = pos; i < s.length(); i++) {
//			String word = s.substring(pos, i + 1);
//			if(wordDict.contains(word)) {
//				String temp = newStr;
//				newStr = newStr + word + " ";
//				DFS(res, newStr, s, wordDict, i + 1);
//				newStr = temp;
//			}
//		}
//	}
}
