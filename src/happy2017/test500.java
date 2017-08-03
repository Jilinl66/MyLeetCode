package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//500. Keyboard Row
public class test500 {
    public String[] findWords(String[] words) {
    	ArrayList<String> resArr = new ArrayList<>();
        Set<Character> set1 = new HashSet<Character>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> set2 = new HashSet<Character>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> set3 = new HashSet<Character>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
        ArrayList<Set<Character>> sets = new ArrayList<Set<Character>>(); 
        sets.add(set1);
        sets.add(set2);
        sets.add(set3);
        for(String word: words){
        	boolean flag = true;
        	int target = -1;
        	for(int i = 0; i < word.length(); i++){
        		for(int j = 0; j < 3; j++){
        			if(sets.get(j).contains(Character.toLowerCase(word.charAt(i)))){
        				System.out.println("c: " + word.charAt(i) + " j: " + j);
        				if(i == 0)
        					target = j;
        				else if(j != target){
        					flag = false;
        					break;
        				}
        				else
							continue;
        			}
        		}
        		if(!flag)
        			break;
        	}
        	if(flag)
        		resArr.add(word);
        }
        String[] res = new String[resArr.size()];
        for(int i = 0; i < res.length; i++)
        	res[i] = resArr.get(i);
        return res;
    }
}
