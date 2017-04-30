package happy2017;

import java.util.ArrayList;
import java.util.List;

//131. Palindrome Partitioning
public class test131 {
    public List<List<String>> partition(String s) {
    	List<List<String>> res = new ArrayList<>();
    	List<String> list = new ArrayList<>();
    	backtracking(res, list, s, 0);
    	return res;
    }
    
    private void backtracking(List<List<String>> res, List<String> list, String s, int pos) {
		if(list.size() > 0 && pos == s.length())
			res.add(new ArrayList<>(list));
		for(int i = pos + 1; i <= s.length(); i++){
			if(isPalindrome(s, pos, i)){
				list.add(s.substring(pos, i));
				backtracking(res, list, s, i);
				list.remove(list.size() - 1);
			}
		}
	}
    
    private boolean isPalindrome(String s, int i, int j){
    	j--;
    	if(i == j) return true;
    	while(i < j){
    		if(s.charAt(i) != s.charAt(j)) return false;
    		i ++;
    		j --;
    	}
    	return true;
    }
}
