package happy2017;

//132. Palindrome Partitioning II
public class test132 {
    public int minCut(String s) {
        char[] cArray = s.toCharArray();
        int len = s.length();
        int[] cut = new int[len];
        boolean[][] pali = new boolean[len][len];
        for(int r = 0; r < len; r++){
        	int min = r;
        	for(int l = 0; l <= r; l++){
        		if(cArray[l] == cArray[r] && (l + 1 > r - 1 || pali[l + 1][r - 1])){
        			pali[l][r] = true;
        			min = (l == 0? 0: Math.min(min, cut[l - 1] + 1));
        		}
        	}
        	cut[r] = min;
        }
        return cut[len - 1];
    }
}
