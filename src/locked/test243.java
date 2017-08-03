package locked;

import java.util.ArrayList;

//243. Shortest Word Distance
public class test243 {
    public int shortestDistance(String[] words, String word1, String word2) {
    	ArrayList<Integer> l1 = new ArrayList<>();
    	ArrayList<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
			if(words[i].equals(word1))
				l1.add(i);
			else if(words[i].equals(word2))
				l2.add(i);
		}
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < l1.size(); i++)
        	for (int j = 0; j < l2.size(); j++)
        		min = Math.min(min, Math.abs(l1.get(i) - l2.get(j)));
        return min;
    }
}

//LinkedIn
//Duplication in the words
//distance is absolute
//In java -1 % 5 == -1