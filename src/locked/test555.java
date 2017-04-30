package locked;

//555. Split Concatenated Strings
public class test555 {
    public String splitLoopedString(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
        	String reverse = new StringBuilder(strs[i]).reverse().toString();
        	if(strs[i].compareTo(reverse) < 0)
        		strs[i] = reverse;
		}
        String res = "";
        for (int i = 0; i < strs.length; i++) {
        	String reverse = new StringBuilder(strs[i]).reverse().toString();
        	for(String str: new String[]{strs[i], reverse}) {
        		for(int k = 0; k < str.length(); k++) {
        			StringBuilder newStr = new StringBuilder(str.substring(k));
        			for(int j = i + 1; j < strs.length; j++)
        				newStr.append(strs[j]);
        			for(int j = 0; j < i; j++)
        				newStr.append(strs[j]);
        			newStr.append(str.substring(0, k));
        			if(newStr.toString().compareTo(res) > 0)
        				res = newStr.toString();
        		}
        	}
        }
        return res;
    }
}
