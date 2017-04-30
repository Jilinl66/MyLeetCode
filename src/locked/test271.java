package locked;

import java.util.ArrayList;
import java.util.List;

//271. Encode and Decode Strings
public class test271 {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sBuilder = new StringBuilder();
        for(String s: strs) {
        	sBuilder.append(s.length()).append("/").append(s);
        }
        return sBuilder.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int start = 0;
        while(start < s.length()) {
        	int slash = s.indexOf("/", start);
        	int size = Integer.parseInt(s.substring(start, slash));
        	String str = s.substring(slash + 1, slash + 1 + size);
        	res.add(str);
        	start = slash + size + 1;
        }
        return res;
    }
}

//Google