package happy2017;
//67. Add Binary
public class test67 {
    public String addBinary(String a, String b) {
        String res = "";
        int carry = 0;
        int sum = 0;
        int i, j;
        char[] aA = a.toCharArray();
        char[] bA = b.toCharArray();
        for(i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--){
        	sum = Character.getNumericValue(aA[i]) + Character.getNumericValue(bA[j]);
        	res = String.valueOf((sum + carry) % 2) + res;
            carry = sum + carry >= 2? 1: 0;
        }
        while(i >= 0){
        	res = String.valueOf((Character.getNumericValue(aA[i]) + carry) % 2) + res;
        	carry = (Character.getNumericValue(aA[i]) + carry >= 2? 1: 0);
        	i--;
        }
        while(j >= 0){
        	res = String.valueOf((Character.getNumericValue(bA[j]) + carry) % 2) + res;
        	carry = (Character.getNumericValue(bA[j]) + carry >= 2? 1: 0);
        	j--;
        }
        return carry == 1? "1" + res: res;
    }
}
