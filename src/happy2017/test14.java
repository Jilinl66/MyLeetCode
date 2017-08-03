package happy2017;
//14. Longest Common Prefix
public class test14 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) return "";
    	String commPre = strs[0];
    	int idx = commPre.length();
    	for(int i = 1; i < strs.length; i++) {
    		while(idx > 0 && !strs[i].startsWith(commPre.substring(0, idx)))
    			idx--;
    		if(idx == 0) break;
    	}
    	return commPre.substring(0, idx);
    }
}
