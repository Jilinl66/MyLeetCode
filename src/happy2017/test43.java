package happy2017;
//43. Multiply Strings
public class test43 {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] pos = new int[len1 + len2];
        for(int i = len1 - 1; i >=0; i--){
        	for(int j = len2 - 1; j >= 0; j--){
        		boolean carry = true;
        		int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        		int sum = mul + pos[i + j +1];
        		pos[i + j + 1] = sum % 10;
        		pos[i + j] += sum/10;
        	}
        }
        StringBuilder sBString = new StringBuilder();
        for(int i = 0; i < pos.length; i++){
        	if(sBString.length() == 0 && pos[0] == 0)
        		continue;
        	sBString.append(pos[i]);
        }
        return (sBString.length() == 0 ? "0":sBString.toString());
    }
}
	