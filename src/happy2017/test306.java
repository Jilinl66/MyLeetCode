package happy2017;
//306. Additive Number
public class test306 {
    public boolean isAdditiveNumber(String num) {
        int len = num.length();
        for(int i = 1; i <= len /2; i++)
        	for(int j = 1; Math.max(i, j) <= len - i - j; j++)
        		if(isValid(num, i, j))
        			return true;
        return false;
    }

	private boolean isValid(String str, int i, int j) {
		if(str.charAt(0) == '0' && i > 1) return false;
		if(str.charAt(i) == '0' && j > 1) return false;
		String sum;
		Long l1 = Long.parseLong(str.substring(0, i));
		Long l2 = Long.parseLong(str.substring(i, i + j));
		for(int start = i + j; start < str.length(); start += sum.length()){
			sum = String.valueOf(l1 + l2);
			if(!str.startsWith(sum, start)) return false;
			l1 = l2;
			l2 = Long.parseLong(sum);
		}
		return true;
	}
}
