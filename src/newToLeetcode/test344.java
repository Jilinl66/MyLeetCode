package newToLeetcode;
//344. Reverse String
/**
 * @author LiuJilin
 *
 */
public class test344 {
//    public String reverseString(String s) {
//    	StringBuilder sBuilder = new StringBuilder();
//    	for(int i = s.length()-1; i >= 0; i--)
//    		sBuilder.append(s.charAt(i));
//    	return sBuilder.toString();
//    }
    
    public String reverseString(String s) {
    	char[] chars = s.toCharArray();
    	int i = 0;
    	while(i < s.length() /2){
    		char temp = chars[i];
    		chars[i] = chars[s.length() - 1 - i];
    		chars[s.length() - 1 - i] = temp;
    	}
    	return new String(chars);
    }
}
