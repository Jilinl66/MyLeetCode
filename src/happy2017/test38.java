package happy2017;
//38. Count and Say
public class test38 {
    public String countAndSay(int n) {
    	String num = "1";
        for(int i = 1; i < n; i++){
        	StringBuilder newNumStr = new StringBuilder();
        	for(int k = 0; k < num.length(); k++){
        		char ch = num.charAt(k);
        		int count = 1;
        		while(k + 1 < num.length() && num.charAt(k + 1) == num.charAt(k)){
        			k ++;
        			count ++;
        		}
        		newNumStr.append(String.valueOf(count)).append(String.valueOf(ch));
        	}
        	num = newNumStr.toString();
        }
        return num;
    }
}
