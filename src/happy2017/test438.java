package happy2017;

import java.util.ArrayList;
import java.util.List;

//438. Find All Anagrams in a String
public class test438 {
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> res = new ArrayList<>();
    	int len1 = s.length(), len2 = p.length();
    	if(len1 < len2) return res;
    	int[] count = new int[26];
    	for(int i = 0; i < len2; i++) {
    		count[p.charAt(i) - 'a']++;
    		count[s.charAt(i) - 'a']--;
    	}
    	if(checkAllZero(count))
    		res.add(0);
    	for(int i = len2; i < len1; i++) {
    		count[s.charAt(i - len2) - 'a']++;
    		count[s.charAt(i) - 'a']--;
    		if(checkAllZero(count))
    			res.add(i - len2 + 1);
    	}
    	return res;
    }
    
    public boolean checkAllZero(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i] != 0) return false;
		return true;
    }
}
