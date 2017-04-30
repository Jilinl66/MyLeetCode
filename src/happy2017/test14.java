package happy2017;
//14. Longest Common Prefix
public class test14 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0 || strs == null) return "";
        String commStr = strs[0];
		for(int i = 0; i < strs.length; i++){
			while(strs[i].indexOf(commStr) != 0)
				commStr = commStr.substring(0, commStr.length() - 1);
			if(commStr == "") break;
		}
		return commStr;
    }
}
