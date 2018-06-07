package happy2017;

//8. String to Integer (atoi)
public class test8 {
	public int myAtoi(String str) {
		int res = 0;
		int flag = 1;
		int i = 0;
		int len = str.length();
		while(i < len) {
			while(i < len && str.charAt(i) == ' ') {
				i++;
			}
			if(str.charAt(i) == '+' || str.charAt(i) == '-') {
				if(str.charAt(i) == '-')
					flag = -1;
				i++;
			}
			while(i < len && Character.isDigit(str.charAt(i))) {
				int digit = Character.getNumericValue(str.charAt(i));
				if(res < Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && digit <=7)) {
					res = res * 10 + digit;
					i ++;
				}
				else
					return flag == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
			}
			break;
		}
		return res * flag;
	}
}

/** Amazon Microsoft Bloomberg Uber
 * 
 */