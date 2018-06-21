package happycoding2018;

import java.util.List;

public class Q139_WordBreak {
	 public boolean wordBreak(String s, List<String> wordDict) {
	        boolean[] memo = new boolean[s.length()];
	        for (int i = 0; i < s.length(); i++) {
	            if (i == 0 || memo[i - 1]) {
	                for (String word: wordDict) {
	                    String sub = s.substring(i);
	                    if (sub.startsWith(word)) {
	                        memo[i + word.length() - 1] = true;
	                    }
	                }
	            }
	        }
	        return memo[s.length() - 1];
	    }
}
