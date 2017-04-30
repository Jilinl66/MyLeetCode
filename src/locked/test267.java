package locked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//267. Palindrome Permutation II
public class test267 {
    public List<String> generatePalindromes(String s) {    
    	List<String> res = new ArrayList<>();
        ArrayList<Character> uniChar = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(set.contains(c)) {
        		uniChar.add(c);
        		set.remove(c);
        	}
        	else {
        		set.add(c);
        	}
		}
        if(set.size() > 1) return res;
        String str = set.size() == 0? "": String.valueOf(set.iterator().next());
        //Same character put together for duplication avoidance opearation
        Collections.sort(uniChar);
        backtracking(res, str, uniChar, new boolean[uniChar.size()], s.length());
        return res;
    }
    
    public void backtracking(List<String> res, String str, ArrayList<Character> uniChar, boolean[] visited, int n) {
    	if(str.length() == n) {
    		res.add(str);
    		return;
    	}
    	for(int i = 0; i < uniChar.size(); i++) {
    		//Avoid duplication
    		if((i > 0 && uniChar.get(i) == uniChar.get(i - 1) && !visited[i - 1]) || visited[i]) continue;
   			String newStr = String.valueOf(uniChar.get(i)) + str + String.valueOf(uniChar.get(i));
			visited[i] = true;
			backtracking(res, newStr, uniChar, visited, n);
			visited[i] = false;
    	}
    }
}


//Reduplication
