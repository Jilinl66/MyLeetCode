package happy2017;
//541. Reverse String II
public class test541 {
    public String reverseStr(String s, int k) {
    	StringBuilder sBuilder = new StringBuilder();
    	sBuilder.append(s);
        int i = 0;
        while(i < s.length()){
        	int last = Math.min(s.length(), i + k);
        	sBuilder.replace(i, last, reverse(s.substring(i, last)));
        	i += 2*k;
        }
        return sBuilder.toString();
    }
    
    private String reverse(String s) {
    	StringBuilder sBuilder = new StringBuilder();
    	sBuilder.append(s);
    	return sBuilder.reverse().toString();
    }
}
