package happy2017;
//28. Implement strStr()
public class test28 {
    public int strStr(String haystack, String needle) {
    	if(needle.length() == 0) 
			return 0;
    	else if(haystack.length() == 0)
			return -1;
    	int len1 = haystack.length(), len2 = needle.length();
        for(int i = 0; i < len1 - len2 + 1; i++){
        	if(haystack.charAt(i) == needle.charAt(0)){
        		int j;
        		for(j = 0; j < len2; j++){
        			if(haystack.charAt(i + j) != needle.charAt(j))
        				break;
        		}
        		if(j == len2)
        			return i;
        	}
        }
        return -1;
    }
}
