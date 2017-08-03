package locked;

import java.util.ArrayList;
import java.util.HashMap;

//244. Shortest Word Distance II
public class test244 {
	HashMap<String, ArrayList<Integer>> map = new HashMap<>();
	
    public test244(String[] words) {
        for (int i = 0; i < words.length; i++) {
			if(map.get(words[i]) == null)
				map.put(words[i], new ArrayList<>());
			map.get(words[i]).add(i);
		}
    }
    
    public int shortest(String word1, String word2) {
        ArrayList<Integer> l1 = map.get(word1);
        ArrayList<Integer> l2 = map.get(word2);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < l1.size(); i++)
        	for (int j = 0; j < l2.size(); j++)
        		min = Math.min(min, Math.abs(l1.get(i) - l2.get(j)));
        return min;
    }
}

//LinkedIn