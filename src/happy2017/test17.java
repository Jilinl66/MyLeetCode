package happy2017;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//17. Letter Combinations of a Phone Number
public class test17 {
	String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0) return res;
		backtracking(res, new StringBuilder(), 0, digits);
        return res;
    }
    
    private void backtracking(List<String> res, StringBuilder sBuilder, int pos, String digits) {
    	if(sBuilder.length() == digits.length())
    		res.add(sBuilder.toString());
    	int digit = Character.getNumericValue(digits.charAt(pos));
    	for(int i = 0; i < letters[digit].length(); i++) {
    		sBuilder.append(letters[digit].charAt(i));
    		backtracking(res, sBuilder, pos + 1, digits);
    		sBuilder.deleteCharAt(sBuilder.length() - 1);
    	}
    }
}

/** Amazon Dropbox Google Uber Facebook
 * 
 */