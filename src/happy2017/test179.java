package happy2017;

import java.util.Arrays;
import java.util.Comparator;

//179. Largest Number
public class test179 {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0)
        	return "";
        String[] s_array = new String[nums.length];
        for(int i = 0; i< nums.length; i++)
        	s_array[i] = String.valueOf(nums[i]);
        Comparator<String> comparator = new Comparator<String>() {
        	@Override
        	public int compare(String s1, String s2) {
				String con1 = s1 + s2, con2 = s2 + s1;
				return con2.compareTo(con1);
			}
		};
		Arrays.sort(s_array, comparator);
		if(s_array[0].charAt(0) == '0')
			return "0";
		StringBuilder sBuilder = new StringBuilder();
		for(String s: s_array)
			sBuilder.append(s);
		return sBuilder.toString();
    }
}
