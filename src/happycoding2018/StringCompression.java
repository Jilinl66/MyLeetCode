package happycoding2018;

public class StringCompression {
	
	public static void main(String[] args) {
		String string = "abbbbbcdaee";
		System.out.println(compressString(string));
	}
	
	public static String compressString(String s) {
		String resStr = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			char c = s.charAt(i);
			while(i+ 1 < s.length() && s.charAt(i + 1) == c) {
				count ++;
				i ++;
			}
			resStr += String.valueOf(count) + c;
		}
		return resStr;
	}
}
