package happy2017;
//6. ZigZag Conversion
public class test6 {
	public String convert(String s, int numRows) {
		int len = s.length();
		char[] c = s.toCharArray();
		StringBuilder[] sBuilders = new StringBuilder[numRows];
		for(int i = 0; i < numRows; i++)
			sBuilders[i] = new StringBuilder();
		int i = 0;
		while(i < len) {
			for(int idx = 0; i < len && idx < numRows; idx++)
				sBuilders[idx].append(c[i++]);
			for(int idx = numRows - 2; i < len && idx >= 1; idx--)
				sBuilders[idx].append(c[i++]);
		}
		for(int j = 1; j < numRows; j++)
			sBuilders[0].append(sBuilders[j]);
		return sBuilders[0].toString();
	}
	/**
    public String convert(String s, int numRows) {
    	if(s == null || s.ength() == 0) return "";
    	if(numRows == 1) return s;
        int len = s.length();
        int cycle = 2 * numRows - 2;
        StringBuilder res = new StringBuilder();
        int numOfCircle = len / cycle + 1;
        for(int i = 0; i < numRows; i++){
        	 for(int c = 0; c < numOfCircle; c++){
        		 if((i == 0 || i == numRows - 1) && c * cycle + i < len)
             		res.append(s.charAt(c * cycle + i));
        		 else{
        			 if(c * cycle + i  < len)
        				 res.append(s.charAt(c * cycle + i));
        			 if((c + 1) * cycle - i < len){
        				 res.append(s.charAt((c + 1) * cycle - i));
        			 }
        		 }
        	 }
        }
        return res.toString();
    }
    */
}
