package happy2017;
//125. Valid Palindrome

public class test125 {
    public boolean isPalindrome(String s) {
    	if(s.isEmpty())
    		return true;
    	int i = 0, len = s.length(), j = len - 1;
        while(i < j){
        	while(i < j && i < len && !Character.isLetterOrDigit(s.charAt(i)))
        		i++;
        	while(i < j && j >= 0 && !Character.isLetterOrDigit(s.charAt(j)))
        		j--;
        	if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
        		return false;
        	i++;
        	j--;
        }
       return true;
    }    
}
