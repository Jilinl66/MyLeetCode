package newToLeetcode;
//8. String to Integer (atoi)
public class test8 {
	public int myAtoi(String str) {
		int i = 0, sign = 1;
		long number = 0;
        if(str.isEmpty()) return 0;
        while(str.charAt(i) == ' ' && i < str.length())
        	i++;
        if(str.charAt(i) == '+'){
        	sign = 1;
            i++;
        }
        else if(str.charAt(i) == '-'){
        	sign = -1;
        	i++;
        }
        while (i < str.length()) {
        	int digit = str.charAt(i) - '0';
        	if(digit < 0 || digit > 9) break;
        	if(10 * number + digit > Integer.MAX_VALUE)
        		return sign == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
        	number = 10 * number + digit;
        	i++;
       }
        return (int) (sign * number);
    }
}
