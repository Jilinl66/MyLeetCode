package happy2017;

//318. Maximum Product of Word Lengths
public class test318 {
	public int maxProduct(String[] words) {
		if(words == null || words.length < 2) return 0;
		int n = words.length;
		int[] value = new int[n];
		for(int i = 0; i < n; i++) {
			String word = words[i];
			for(char c: word.toCharArray())
				value[i] |= (1 << c - 'a');
		}
		int maxProduct = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if((value[i] & value[j]) == 0)
					maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
			}
		}
		return maxProduct;
	}
}
 