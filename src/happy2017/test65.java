package happy2017;
//65. Valid Number
public class test65 {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numSeen = false;
        boolean numAfterE = true;
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
        		numSeen = true;
        		numAfterE = true;
        	}
        	else if(s.charAt(i) == '.'){
        		if(pointSeen || eSeen)
        			return false;
        		pointSeen = true;
        	}
        	else if(s.charAt(i) == 'e'){
        		if(eSeen || !numSeen)
        			return false;
        		numAfterE = false;
        		eSeen = true;
        	}
        	else if(s.charAt(i) == '+' || s.charAt(i) == '-'){
				if(i != 0 && s.charAt(i - 1) != 'e')
					return false;
			}
        	else
				return false;
        }
        return numAfterE && numSeen;
    }
}
