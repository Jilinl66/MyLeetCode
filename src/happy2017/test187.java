package happy2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//187. Repeated DNA Sequences
public class test187 {
    public List<String> findRepeatedDnaSequences(String s) {
    	Set<String> set = new HashSet<>();
    	List<String> res = new ArrayList<>();
    	for(int i = 0; i < s.length() - 9; i++) {
    		String str = s.substring(i, i + 10);
    		if(!set.add(str) && !res.contains(str)) {
    			res.add(str);
    		}
    	}
    	return res;
    }
}

/** LinkedIn
 */