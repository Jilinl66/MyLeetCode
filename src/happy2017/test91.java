package happy2017;
//91. Decode Ways 
public class test91 {
    public int numDecodings(String s) {
        if(s.length() == 0) return 0;
        int n = s.length();
        int[] memo = new int[n + 1];
        memo[n] = 1;
        memo[n - 1] = (s.charAt(n - 1) == '0' ? 0: 1);
        for(int i = n - 2; i >= 0; i--){
        	if(s.charAt(i) == '0') continue;
        	else{
        		if(Integer.valueOf(s.substring(i, i + 2)) <= 26)
        			memo[i] = memo[i + 1] + memo[i + 2];
        		else
        			memo[i] = memo[i + 1];
        	}
        }
        return memo[0];
    }
}
