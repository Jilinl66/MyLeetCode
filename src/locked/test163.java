package locked;

import java.util.ArrayList;
import java.util.List;

//163. Missing Ranges
public class test163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        long start, end;
        for(int i = -1; i < nums.length; i++) {
        	if(i == -1) {
        		start = lower;
        		end = (nums.length == 0? upper: (long)nums[0] - 1);
        	}
        	else if (i == nums.length - 1) {
        		start = (long)nums[i] + 1;
        		end = upper;
        	}
        	else {
        		start = (long)nums[i] + 1;
            	end =  (long)nums[i + 1] - 1;
        	}
        	if(start > end)
        		continue;
        	if(start == end)
        		res.add(String.valueOf(start));
        	else 
        		res.add(String.valueOf(start) + "->" + String.valueOf(end));
        }
        return res;
    }
}

//Google
//Integer overflow, convert to long