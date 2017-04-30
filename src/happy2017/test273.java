package happy2017;

import org.omg.CORBA.PRIVATE_MEMBER;

//273. Integer to English Words
public class test273 {
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
    		"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TEN = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
    public String numberToWords(int num) {
    	if(num == 0)
    		return "Zero";
    	int i = 0;
    	String resWords = "";
    	while(num > 0){
    		if(num % 1000 != 0)
    			resWords = helper(num % 1000) + THOUSANDS[i] + " " + resWords;
    		num /= 1000;
    		i++;
    	}
    	return resWords.trim();
    }
    private String helper(int num) {
		if(num == 0)
			return "";
		else if(num < 20)
			return LESS_THAN_20[num] + " ";
		else if(num < 100)
			return TEN[num/10] + " " + helper(num % 10);
		else 
			return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
	}
}
