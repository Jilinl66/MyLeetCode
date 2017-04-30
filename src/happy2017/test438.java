package happy2017;

import java.util.ArrayList;
import java.util.List;

//438. Find All Anagrams in a String
public class test438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
    	if(s.length() < p.length())
    		return res;
        int[] dic = new int[26];
        int[] window = new int[26];
        for(int i = 0; i < p.length(); i++){
        	dic[p.charAt(i) - 'a']++;
        	window[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j <= s.length() - p.length(); j++){
        	if(j > 0){
        		window[s.charAt(j - 1) - 'a']--;
        		window[s.charAt(j + p.length() - 1) - 'a']++;
        	}
        	if(check(dic, window))
        		res.add(j);
        }
        return res;
    }
    
    public boolean check(int[] a1, int[] a2) {
		for(int i = 0; i< 26; i++){
			if(a1[i] != a2[i])
				return false;
		}
		return true;
	}
}
