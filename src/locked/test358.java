package locked;

//358. Rearrange String k Distance Apart
public class test358 {
    public String rearrangeString(String s, int k) {
        int[] count = new int[26];
        int[] valid = new int[26];
        for(char c: s.toCharArray())
        	count[c - 'a']++;
        StringBuilder sBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
        	int nextPos = findValid(count, valid, i);
        	if(nextPos ==  -1) return "";
        	count[nextPos]--;
        	valid[nextPos] = i + k;
        	sBuilder.append((char)('a' + i));
        }
        return sBuilder.toString();
    }
    
    private int findValid(int[] count, int[] valid, int curIndex) {
    	int max = Integer.MIN_VALUE;
    	int ret = -1;
    	for(int i = 0; i < 26; i++) {
    		if(count[i] > 0 && curIndex >= valid[i] && count[i] > max) {
    			max = count[i];
    			ret = i;
    		}
    	}
    	return ret;
	}
}
