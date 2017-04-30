package locked;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//269. Alien Dictionary
public class test269 {
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> map = new HashMap<>();
        Map<Character, Integer> degree = new HashMap<>();
        String res = "";
        if(words == null || words.length == 0) return res;
        for(String word: words) {
        	for(char c: word.toCharArray()) {
        		degree.put(c, 0);
        	}
        }
        for (int i = 0; i < words.length - 1; i++) {
			String cur = words[i];
			String next = words[i + 1];
			int len = Math.min(cur.length(), next.length());
			for(int j = 0; j < len; j++) {
				char c1 = cur.charAt(j);
				char c2 = next.charAt(j);
				if(c1 != c2) {
					Set<Character> set = new HashSet<>();
					if(map.containsKey(c1)) {
						set = map.get(c1);
					}
					if(!set.contains(c2)) {
						set.add(c2);
						map.put(c1, set);
						degree.put(c2, degree.get(c2) + 1);
					}
					break;
				}
			}
		}
        
        Queue<Character> queue = new LinkedList<>();
        for(char c: degree.keySet()) {
        	if(degree.get(c) == 0)
        		queue.add(c);
        }
        while(!queue.isEmpty()) {
        	char pop = queue.poll();
        	res += pop;
        	if(map.containsKey(pop)) {
	        	for(char c: map.get(pop)) {
	        		degree.put(c, degree.get(c) - 1);
	        		if(degree.get(c) == 0)
	        			queue.offer(c);
	        	}
        	}
        }
        if(res.length() != degree.size()) return "";
        return res;
    }
}

// Google Airbnb Facebook Twitter Snapchat Pocket Gems