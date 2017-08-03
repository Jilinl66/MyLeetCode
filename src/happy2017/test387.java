package happy2017;

import java.util.HashSet;

//387. First Unique Character in a String
public class test387 {
    public int firstUniqChar(String s) {
    	HashSet<Character> stack = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
        	char ch = s.charAt(i);
        	if(!stack.contains(ch) && s.lastIndexOf(ch) == i)
        		return i;
        	stack.add(ch);
        }
        return -1;
    }
}
