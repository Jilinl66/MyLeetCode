package newToLeetcode;
//3. Longest Substring Without Repeating Characters  

import java.util.HashMap;

public class test3 {
	
	public static void main(String[] args){
		String s = "qwnfenpglqdq";
		System.out.print(lengthOfLongestSubstring(s));
	}
	
    public static int lengthOfLongestSubstring(String s) {
    	if(s.length() == 0)
    		return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int front=0, end=0;
        int maxLength = 0;
        char cur;
        while(end < s.length()){
        	cur = s.charAt(end);
            if(map.containsKey(cur))
            	if(front <= map.get(cur))
                	front = map.get(cur) + 1;
            map.put(cur, end);	
    		maxLength = Math.max(maxLength, end - front + 1);
            end ++; 
        }
         return maxLength;
    } 
} 