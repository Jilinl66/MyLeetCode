package locked;

import java.util.HashSet;

//266. Palindrome Permutation
public class test266 {
    public boolean canPermutePalindrome(String s) {
    	HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
			if(set.contains(c))
				set.remove(c);
			else
				set.add(c);
		}
        return set.size() <= 1;
    }
}

//Google Uber Bloomberg