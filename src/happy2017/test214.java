package happy2017;
//214. Shortest Palindrome
public class test214 {
	public String shortestPalindrome(String s) {
		int j = 0;
		for(int i = s.length() - 1; i >= 0; i--)
			if(s.charAt(i) == s.charAt(j))
				j++;
		if(j == s.length()) return s;
		String suffix = s.substring(j);
		return new StringBuilder(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;
	}
	//Time limit
//    public String shortestPalindrome(String s) {
//    	int j;
//    	for(j = s.length() - 1; j >=0; j--){
//    		int left = 0, right = j;
//    		while(left < right && s.charAt(left) == s.charAt(right)){
//    			left++;
//    			right--;
//    		}
//			if(left >= right) break;
//    	}
////    	System.out.println(j);
//    	StringBuilder sBuilder = new StringBuilder();
//    	for(int i = s.length() - 1; i > j; i--)
//    		sBuilder.append(s.charAt(i));
//    	sBuilder.append(s);
//    	return sBuilder.toString();
//    }
}
