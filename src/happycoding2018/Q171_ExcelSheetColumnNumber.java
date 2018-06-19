package happycoding2018;

public class Q171_ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int number = 0;
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            int num = chars[i] - 'A' + 1;
            number += Math.pow(26.0, (double)(len - i - 1)) * num;
         }
        return number;
    }
}
