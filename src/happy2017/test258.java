package happy2017;
//258. Add Digits
public class test258 {
    public int addDigits(int num) {
    	while(num >= 10){
    		String str =Integer.toString(num);
        	int sum = 0;
        	for(int i = 0; i< str.length(); i++){
        		sum += str.charAt(i) - '0';
        	}
        	num = sum;
    	}
    	return num;
    }
}