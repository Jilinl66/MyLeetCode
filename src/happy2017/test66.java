package happy2017;
//66. Plus One
public class test66 {
    public int[] plusOne(int[] digits) {
    	int i = digits.length - 1;
        if(digits[i] != 9){
        	digits[i] ++;
        	return digits;
        }
        else{
        	while(i >= 0 && digits[i] == 9){
        		digits[i] = 0;
        		i--;
        	}
        	if(i >= 0){
        		digits[i]++;
        		return digits;
        	}
        	else{
        		int[] res = new int[digits.length + 1];
        		res[0] = 1;
        		for(int j = 1; j < res.length; j++)
        			res[j] = 0;
            	return res;
        	}
        }
    }
	//overflow problem
//	public int[] plusOne(int[] digits) {
//		long num = 0;
//		for(int i: digits)
//			num = 10 * num + i;
//		num ++;
//		int[] res = new int[String.valueOf(num).length()];
//		for(int i = res.length - 1; i >= 0; i--){
//			res[i] = (int) (num % 10);
//			num /= 10;
//		}
//		return res;
//	}
}
