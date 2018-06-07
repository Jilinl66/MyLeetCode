package happycoding2018;

//Yelp OA V8
// Remove duplicates from a given string, for example: sdkeeeeke -> sdkeke
public class ReduceString {
	public static void main(String[] args) {
		String string = "aaad";
		System.out.println(removeDuplicateChar(string));
	}
	
	public static String removeDuplicateChar(String s) {
		String reducedString = "";
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 || s.charAt(i) != s.charAt(i-1)) {
				reducedString += s.charAt(i);
			}
		}
		return reducedString;
	}
}
