package happy2017;

import java.util.HashMap;
import java.util.Map;

//290. Word Pattern
public class test290 {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(strs.length != pattern.length()) return false;
        Map map = new HashMap<>();
        for(Integer i = 0; i < strs.length; i++)
        	if(!map.put(pattern.charAt(i), i).equals(map.put(strs[i], i)))
        		return false;
        return true;
    }
}
