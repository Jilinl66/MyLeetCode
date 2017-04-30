package locked;

//408. Valid Word Abbreviation
public class test408 {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        while(i < word.length() && j < abbr.length()) {
        	int num = 0; 
        	if(abbr.charAt(j) == '0') return false;
    		while (j < abbr.length() && Character.isDigit(abbr.charAt(j)))
				num = 10 * num + Character.getNumericValue(abbr.charAt(j++));        		
    		i += num;
        	if(i < word.length() && j < abbr.length() && word.charAt(i++) != abbr.charAt(j++))
				return false;
        }
        return i == word.length() && j == abbr.length();        	
    }
}

//Special case of number: 12, 01