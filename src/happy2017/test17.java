package happy2017;

import java.util.LinkedList;
import java.util.List;

//17. Letter Combinations of a Phone Number
public class test17 {
	public static final String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public List<String> letterCombinations(String digits) {
		List<String> res = new LinkedList<>();
		if(digits == null || digits.length() == 0) return res;
		combination("", 0, digits, res);
		return res;
	}
	
	private void combination(String prefix, int offset, String digits, List<String> res) {
		if(offset >= digits.length()){
			res.add(prefix);
			return;
		}
		int digit = Character.getNumericValue(digits.charAt(offset));
		for(char ch: map[digit].toCharArray())
			combination(prefix + ch, offset + 1, digits, res);
	}
	
//    public List<String> letterCombinations(String digits) {
//        LinkedList<String> reStrings = new LinkedList<>();
//    	if(digits == null || digits.length() == 0) return reStrings;
//        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        reStrings.add("");
//        for(int i = 0; i < digits.length(); i++){
//        	int digit = Character.getNumericValue(digits.charAt(i));
//        	while(reStrings.peek().length() == i){
//        		String s = reStrings.remove();
//        		for(char ch: map[digit].toCharArray())
//        			reStrings.add(s + ch);
//        	}
//        }
//        return reStrings;
//    }
}
