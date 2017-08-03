package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//451. Sort Characters By Frequency
public class test451 {
    public String frequencySort(String s) {
        if(s.length() == 0) return "";
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(char c: s.toCharArray()){
        	map.put(c, map.getOrDefault(c, 0) + 1);
        	max = Math.max(max, map.get(c));
        }
        List<Character>[] sortedArr = new List[max + 1];
        for(char c: map.keySet()){
        	int freq = map.get(c);
         	if(sortedArr[freq] == null)
        		sortedArr[freq] = new ArrayList<>();
    		sortedArr[freq].add(c);
        }
        StringBuilder sBuilder = new StringBuilder();
        for(int i = sortedArr.length - 1; i >= 0; i--){
        	if(sortedArr[i] == null) continue;
        	for(char c: sortedArr[i]){
        		for(int j = 0; j < i; j++)
                	sBuilder.append(c);
        	}
        }
        return sBuilder.toString();
    }
}
