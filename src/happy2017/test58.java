package happy2017;
//58. Length of Last Word
public class test58 {
//    public int lengthOfLastWord(String s) {
//	    String[] array = s.split(" ");
//	    if(array.length == 0)
//	    	return 0;
//	    return array[array.length - 1].length();
//    }
	public int lengthOfLastWord(String s) {
		s = s.trim();
		if(s.length() == 0)
			return 0;
		int i = s.length() - 1;
		while(i >=0 && s.charAt(i) != ' ')
			i--;
		return s.length() - 1 - i;
	}
}
