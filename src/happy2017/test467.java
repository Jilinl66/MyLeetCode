package happy2017;
//467. Unique Substrings in Wraparound String

public class test467 {
    public int findSubstringInWraproundString(String p) {
        int[] count = new int[26];
        int maxLengthCur = 0;
        for(int i = 0; i < p.length(); i++){
        	if(i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i - 1) - p.charAt(i) == 25))
        		maxLengthCur ++;
        	else
        		maxLengthCur = 1;
        	count[p.charAt(i) - 'a'] = Math.max(count[p.charAt(i) - 'a'], maxLengthCur);
        }
        int sum = 0;
        for(int c: count)
        	sum += c;
        return sum;
    }
}
