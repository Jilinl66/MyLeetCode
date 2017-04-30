package locked;

import java.util.ArrayList;
import java.util.List;

//320. Generalized Abbreviation
public class test320 {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
         backtracking(res, word, new StringBuilder(), 0);
         return res;
    }
    
    public void backtracking(List<String> res, String word, StringBuilder abbrv, int pos) {
    	if(pos == word.length()) {
    		res.add(abbrv.toString());
    		return;
    	}
    	for(int i = pos; i < word.length(); i++) {
    		StringBuilder newStr = new StringBuilder(abbrv);
      		if(i == 0 || Character.isAlphabetic(newStr.charAt(newStr.length() - 1)))
    			newStr.append(1);
    		else {
				int lastNum = Character.getNumericValue(newStr.charAt(newStr.length() - 1));
				newStr.replace(newStr.length() - 1, newStr.length(), String.valueOf(lastNum + 1));
    		}	
    		abbrv.append(word.charAt(i));
    		if(i == word.length())
    			res.add(abbrv.toString());
    		backtracking(res, word, newStr, i + 1);
    	}
    }
} 

//Google