package happy2017;
//12. Integer to Roman
public class test12 {
    public String intToRoman(int num) {
    	StringBuilder sBuilder = new StringBuilder();
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        while(num!= 0){
        	int k = num / values[i];
        	for(int j = 0; j < k; j ++){
        		sBuilder.append(symbols[i]);
        		num -= values[i];
        	}
        	i++;
        }
        return sBuilder.toString();
    }
}
