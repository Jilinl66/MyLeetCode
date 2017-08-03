package happy2017;

import java.util.Arrays;
import java.util.Comparator;

//179. Largest Number
public class test179 {
    public String largestNumber(int[] nums) {
    	if(nums == null || nums.length == 0) return "";
    	int len = nums.length;
    	String[] strNum = new String[len];
    	for (int i = 0; i < len; i++)
			strNum[i] = String.valueOf(nums[i]);
    	Arrays.sort(strNum, new Comparator<String>() {
    		@Override
    		public int compare(String o1, String o2) {
    			return (o2 + o1).compareTo(o1 + o2);
    		}
		});
    	if(strNum[0] .charAt(0) == '0') return "0"; // An extreme edge case 
    	StringBuilder suBuilder = new StringBuilder();
    	for(String s: strNum) {
    		suBuilder.append(String.valueOf(s));   
    	}
    	return suBuilder.toString();
    }
}
