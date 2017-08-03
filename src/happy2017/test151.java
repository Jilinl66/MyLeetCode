package happy2017;
//151. Reverse Words in a String
public class test151 {
    public String reverseWords(String s) {
    	String[] strs = s.split(" +");  //multiple spaces between two words
    	String res = "";
    	for(int i = strs.length - 1; i >= 0 ; i--) {
    		res += strs[i].trim() + " ";
    	}
    	return res.trim();
    }
}

/**
 * Microsoft Snapchat Apple Bloomberg Yelp
 */