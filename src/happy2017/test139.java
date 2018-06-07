package happy2017;

import java.util.List;

//139. Word Break

public class test139 {	
    public boolean wordBreak(String s, List<String> wordDict) {
    	if(s == null || s.length() == 0) return false;
    	boolean[] dp = new boolean[s.length() + 1];
    	dp[0] = true;
        for(int i = 1; i <= s.length(); i++) {
        	for(int j = 0; j < i; j++) {
        		if(dp[j] && wordDict.contains(s.substring(j, i))) {
        			dp[i] = true;
        			break;  //dp[i] is true, then break inner loop
        		}
        	}
        }
        return dp[s.length()];
    }
}

/**
 *  Google Uber Facebook Amazon Yahoo Bloomberg Pocket Gems
 *   
 */