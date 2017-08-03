package happy2017;
//557. Reverse Words in a String III
public class test557 {
    public String reverseWords(String s) {
    	if(s == null) return s;
    	StringBuilder sBuilder = new StringBuilder();
    	String[] strs = s.split(" ");
    	for(String str: strs)
    		sBuilder.append(reverseWord(str)).append(" ");
    	return sBuilder.toString().trim();
    }
    
    private String reverseWord(String s) {
		char[] chars = s.toCharArray();
		int i = 0, j = s.length() - 1;
        while(i < j){
        	char temp = chars[i];
        	chars[i] = chars[j];
        	chars[j] = temp;
        	i++; j--;
        }
        return String.valueOf(chars);
	}
}
