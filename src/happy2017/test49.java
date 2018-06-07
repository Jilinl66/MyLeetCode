package happy2017;
//49. Group Anagrams
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		for(String s: strs) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String key = String.valueOf(chars);
			if(!map.containsKey(key))
				map.put(key, new ArrayList<>());
			map.get(key).add(s);
		}
		for(Map.Entry<String, List<String>> entry: map.entrySet())
			res.add(entry.getValue());
		return res;
	}
}
/** Amazon Bloomberg Uber Facebook Yelp
 * 
 */

