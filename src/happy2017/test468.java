package happy2017;
//468. Validate IP Address
public class test468 {
    public String validIPAddress(String IP) {
        if(isValidIPv4(IP)) return "IPv4";
        if(isValidIPv6(IP)) return "IPv6";
        return "Neither";
    }
    
	private boolean isValidIPv4(String IP){
    	if(IP.length() < 7 || IP.charAt(0) == '.' || IP.charAt(IP.length() - 1) == '.')
    		return false;
    	String[] tokens = IP.split("\\.");
    	if(tokens.length != 4) return false;
    	for(String token: tokens)
    		if(!isValidIPv4Token(token))
    			return false;
    	return true;
    }
    
    private boolean isValidIPv4Token(String token){
    	if(token.startsWith("0") && token.length() > 1)
    		return false;
    	try {
			int parsedInt = Integer.parseInt(token);
			if(token.charAt(0) == '-' || token.charAt(0) == '+') return false;
			if(parsedInt < 0 || parsedInt > 255) return false;
		} catch (NumberFormatException e) {
			return false;
		}
    	return true;
    }
    
    private boolean isValidIPv6(String IP) {
		if(IP.length() < 15 || IP.charAt(0) == ':' || IP.charAt(IP.length() - 1) == ':')
			return false;
		String[] tokens = IP.split(":");
		if(tokens.length != 8) return false;
		for(String token: tokens)
			if(!isValidIPv6Token(token))
				return false;
		return true;
	}
    
    private boolean isValidIPv6Token(String token){
    	if(token.length() == 0 || token.length() > 4) return false;
    	char[] chars = token.toCharArray();
    	for(char c: chars)
    		if(!((c >= 48 && c <= 57) || (c >= 65 && c <= 70) || (c >= 97 && c <= 102)))
    			return false;
    	return true;
    }
}
