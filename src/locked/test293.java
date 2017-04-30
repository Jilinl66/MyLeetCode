package locked;

import java.util.ArrayList;
import java.util.List;

//293. Flip Game
public class test293 {
    public List<String> generatePossibleNextMoves(String s) {
    	char[] chars = s.toCharArray();
    	List<String> res = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
        	if(s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
        		chars[i] = '-';
        		chars[i - 1] = '-';
        		res.add(String.valueOf(chars));
        		chars[i] = '+';
        		chars[i - 1] = '+';
        	}
		}
        return res;
    }
}
