package happy2017;
//504. Base 7
public class test504 {
    public String convertToBase7(int num) {
    	if(num == 0) return "0";
    	String res = "";
    	int sign = 1;
        if(num < 0){
        	sign = -1;
        	num = -num;
        }
        while(num > 0){
        	res = String.valueOf(num % 7) + res;
        	num /= 7;
        }
        return sign == 1? res: "-" + res;
    }
}
