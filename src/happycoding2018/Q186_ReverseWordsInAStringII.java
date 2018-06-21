package happycoding2018;

public class Q186_ReverseWordsInAStringII {
	public static void main(String[] args) {
		String s = "the sky is blue";
		char[] c = s.toCharArray();
		reverseWords(c);
		System.out.println(c);
				
	}
	public static void reverseWords(char[] s) {
		reverse(s, 0, s.length - 1);
		int i = 0;
		while(i < s.length) {
			int start = i;
			
			while(s[i] != ' ' && i != s.length) {
				i++;
			}
			reverse(s, start, i - 1);
			i++;
		}
	}
	
	private static void reverse(char[] s, int l, int r) {
		int left = l, right = r;
		while(left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
		}
	}
}
