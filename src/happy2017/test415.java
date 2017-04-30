package happy2017;
//415. Add Strings
public class test415 {
    public String addStrings(String num1, String num2) {
    	String reString = "";
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while(i >= 0 && j >= 0){
        	int sum = num1.charAt(i--) - '0' + num2.charAt(j--) - '0' + carry;
        	System.out.println("sum: " + sum);
        	reString = String.valueOf(sum % 10) + reString ;
        	carry = sum / 10;
        	System.out.println("carry: " + carry + " reString: " + reString);
        }
        while(i >= 0){
        	int sum = num1.charAt(i--) - '0' + carry;
        	reString = String.valueOf(sum % 10) + reString;
        	carry = sum / 10;
        }
        while(j >= 0){
        	int sum = num2.charAt(j--) - '0' + carry;
        	reString = String.valueOf(sum % 10) + reString;
        	carry = sum / 10;
        }
        return carry == 1? "1" + reString: reString;
    }
}
