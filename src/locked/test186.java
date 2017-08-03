package locked;
//186. Reverse Words in a String II
public class test186 {
    public void reverseWords(char[] s) {
    	reverse(s, 0, s.length - 1);
    	int start = 0;
    	for(int i = 0; i < s.length; i++) {
    		if(s[i] == ' '){
    			reverse(s, start, i - 1);
    			start = i + 1;
    		}
    	}
    	reverse(s, start, s.length - 1);
    }
    
    private void reverse(char[] s, int start, int end) {
    	for(int i = start, j = end; i < j; i++, j--) {
			 char c = s[i];
			 s[i] = s[j];
			 s[j] = c;
    	}
	}
}

//Amazon Microsoft Uber
