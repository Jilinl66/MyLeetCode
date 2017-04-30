package happy2017;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
//hard!
//140. Word Break II
public class test140 {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        if(s.isEmpty())
        	return null;
        return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
    }
    
    List<String> DFS(String s, Set<String> wordDict, HashMap<String, LinkedList<String>> map){
    	if(map.containsKey(s))
    		return map.get(s);
    	LinkedList<String> reStrings = new LinkedList<String>();
    	if(s.isEmpty()){
    		reStrings.add("");
    		return reStrings;
    	}
    	for(String word:wordDict){
    		if(s.startsWith(word)){
    			List<String> sublist = DFS(s.substring(word.length()), wordDict, map);
    			for(String sub: sublist)
    				reStrings.add(word + (sub.isEmpty()? "": " ") + sub);
    		}
    	}
    	map.put(s, reStrings);
    	return reStrings;
    }
}
