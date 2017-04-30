package happy2017;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//127. Word Ladder
//should accept
public class test127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    	if(!wordList.contains(beginWord) || !wordList.contains(endWord)) return 0;
    	Set<String> beginSet = new HashSet<String>(), endSet = new HashSet<String>(), visited = new HashSet<String>();
    	int len = 1;
    	beginSet.add(beginWord);
    	endSet.add(endWord);
    	while (!beginSet.isEmpty() && !endSet.isEmpty()) {
    		if (beginSet.size() > endSet.size()) {
    			Set<String> temp = beginSet;
    			beginSet = endSet;
    			endSet = temp;
    		}
    		Set<String> toAdd = new HashSet<String>();
    		for (String word : beginSet) {
    			for (int i = 0; i < word.length(); i++) {
    				char[] chs = word.toCharArray();
    				for (char c = 'a'; c <= 'z'; c++) {
    					chs[i] = c;
    					String target = String.valueOf(chs);
    					if (endSet.contains(target))
    						return len + 1;
    					if (wordList.contains(target) && !visited.contains(target)) {
//    						System.out.println("word: " + word + " target: " + target);
    						toAdd.add(target);
    						visited.add(target);
    					}
    				}
    			}
    		}
    		beginSet = toAdd;
    		len++;
    	} 	
    	return 0;
    }
}
