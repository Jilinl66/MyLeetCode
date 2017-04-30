package happy2017;
//482. License Key Formatting
public class test482 {
    public String licenseKeyFormatting(String S, int K) {
    	StringBuilder sBuilder = new StringBuilder();
    	for(int i = S.length() - 1; i >= 0; i--){
    		if(S.charAt(i) == '-') continue;
    		if(sBuilder.length() % (K + 1) == K)
    			sBuilder.append("-").append(S.charAt(i));
    		else
				sBuilder.append(S.charAt(i));
    	}
    	return sBuilder.reverse().toString().toUpperCase();
    }
}
