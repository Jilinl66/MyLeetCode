package locked;

import java.util.ArrayList;

//245. Shortest Word Distance III
public class test245 {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE;

    	if(word1.equals(word2)){
    		int i = Integer.MIN_VALUE;
    		int j = Integer.MIN_VALUE;
    		for (int k = 0; k < words.length; k++) {
    			if(words[k].equals(word1)){
    				if(i == Integer.MIN_VALUE)
    					i = k;
    				else {
    					j = k;
    					min = Math.min(j - i, min);
    					i = j;
    				}
    			}
    		}
    	}
    	else{
    		ArrayList<Integer> l1 = new ArrayList<>();
        	ArrayList<Integer> l2 = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
    			if(words[i].equals(word1))
    				l1.add(i);
    			else if(words[i].equals(word2))
    				l2.add(i);
    		}
            for(int i = 0; i < l1.size(); i++)
            	for (int j = 0; j < l2.size(); j++)
            		min = Math.min(min, Math.abs(l1.get(i) - l2.get(j)));
    	}
    	
        return min;
    }
}

//Read other's if do it next time.