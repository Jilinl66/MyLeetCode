package happy2017;
//6. ZigZag Conversion
public class test6 {
    public String convert(String s, int numRows) {
    	if(s == null || s.length() == 0) return "";
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
}
