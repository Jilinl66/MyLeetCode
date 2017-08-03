package happy2017;

import java.util.ArrayList;
import java.util.List;

//228. Summary Ranges
public class test228 {
    public List<String> summaryRanges(int[] nums) {
    	List<String> res = new ArrayList<>();
    	int i = 0;
    	while(i < nums.length) {
    		int start = i;
    		String s = "";
    		s += String.valueOf(nums[i]);
    		while(i + 1 < nums.length && nums[i + 1] == nums[i] + 1)
    			i++;
    		if(i != start) {
    			s += "->";
    			s += String.valueOf(nums[i]);
    		}
    		res.add(s);
    		i++;
    	}
    	return res;
    }
}
