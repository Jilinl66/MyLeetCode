package happy2017;
//168. Excel Sheet Column Title
public class test168 {
    public String convertToTitle(int n) {
        String str = "";
        while(n > 0){
        	char ch = (char) ('A' + (--n) % 26);
        	str = String.valueOf(ch) + str;
        	n  = n/26;
        }
        return str;
    }
}
