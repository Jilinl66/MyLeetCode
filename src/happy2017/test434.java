package happy2017;
//434. Number of Segments in a String
public class test434 {
    public int countSegments(String s) {
    	int count = 0;
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == ' ') continue;
        	while(i < s.length() && s.charAt(i) != ' ')
        		i++;
        	count ++;
        }
        return count;
    }
}
