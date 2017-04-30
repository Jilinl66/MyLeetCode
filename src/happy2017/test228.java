package happy2017;

import java.util.ArrayList;
import java.util.List;

//228. Summary Ranges
public class test228 {
    public List<String> summaryRanges(int[] nums) {
    	List<String> reStrings = new ArrayList<>();
    	String str = "";
        for(int i = 0; i < nums.length; i++){
        	int start = i;
        	str += String.valueOf(nums[i]);
        	while(i + 1 < nums.length && nums[i + 1] - nums[i] == 1)
        		i ++;
        	if(i > start)
        		str += "->" + String.valueOf(nums[i]);        			
        	reStrings.add(str);
        	str = "";
        }
        return reStrings;
    }
}
