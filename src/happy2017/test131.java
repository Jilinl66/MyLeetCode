package happy2017;

import java.util.ArrayList;
import java.util.List;

//131. Palindrome Partitioning
public class test131 {
    public List<List<String>> partition(String s) {
    	List<List<String>> res = new ArrayList<>();
    	backtracking(res, new ArrayList<>(), s, 0);
    	return res;
    }
    
    private void backtracking(List<List<String>> res, List<String> list, String s, int pos) {
		if(list.size() > 0 && pos == s.length()) {
			res.add(list);
			return;
		}
		for(int i = pos + 1; i <= s.length(); i++) {
			if(isPalindrome(s, pos, i - 1)) {
				list.add(s.substring(pos, i));
				backtracking(res, new ArrayList<>(list), s, i);
				list.remove(list.size() - 1);
			}
		}
	}
    
    private boolean isPalindrome(String s, int i, int j) {
    	while(i < j) {
    		if(s.charAt(i) != s.charAt(j))
    			return false;
    		i ++; j --;
    	}
    	return true;
	}
}
