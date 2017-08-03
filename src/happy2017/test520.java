package happy2017;
//520. Detect Capital
public class test520 {
	public boolean detectCapitalUse(String word) {
		int numOfUpper = 0;
		for(char c: word.toCharArray())
			if(Character.isUpperCase(c)) numOfUpper++;
		if(numOfUpper == 0 || numOfUpper == word.length() || (numOfUpper == 1 && Character.isUpperCase(word.charAt(0)))) return true;
		return false; 
	}
//    public boolean detectCapitalUse(String word) {
//    	char[] ch = word.toCharArray();
//    	int len = ch.length;
//    	if(len == 1) return true;
//        if(Character.isUpperCase(ch[0])){
//        	if(Character.isUpperCase(ch[1])){
//        		for(int i = 2; i < len; i++)
//        			if(Character.isLowerCase(ch[i])) return false;
//        	}
//        	else
//        		for(int i = 2; i < len; i++)
//        			if(Character.isUpperCase(ch[i])) return false;
//        }
//        else{
//        	for(int i = 1; i < len; i++)
//        		if(Character.isUpperCase(ch[i])) return false;
//        }
//        return true;
//    }
}
