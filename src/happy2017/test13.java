package happy2017;

import java.util.HashMap;
import java.util.Map;

//13. Roman to Integer
public class test13 {
    public int romanToInt(String s) {
    	Map<Character, Integer> map = new HashMap<Character, Integer>(){
    		{put('M', 1000); put('D', 500); put('C', 100); 
    		put('L', 50); put('X', 10); put('V', 5); put('I', 1);
    		}};
    	int num = 0;
        for(int i = 0; i < s.length(); i++){
        	if(i > 0 && map.get(s.charAt(i)).intValue() > map.get(s.charAt(i - 1)).intValue())
        		num = num - 2 * map.get(s.charAt(i - 1));
        	num += map.get(s.charAt(i));
        }
        return num;
    }
}
