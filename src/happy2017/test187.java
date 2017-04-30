package happy2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//187. Repeated DNA Sequences
public class test187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> words = new HashSet<>();
        Set<String> doubleWords = new HashSet<>();
        for(int i = 0; i < s.length() - 9; i++){
        	String str = s.substring(i, i + 10);
        	if(!words.add(str))
        		doubleWords.add(str);
        }
        return new ArrayList<String>(doubleWords);
    }
}
