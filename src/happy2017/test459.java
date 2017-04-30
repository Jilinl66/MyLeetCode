package happy2017;
//459. Repeated Substring Pattern
public class test459 {
	public boolean repeatedSubstringPattern(String s) {
    	int len = s.length();
    	for(int i = len/2; i >= 1; i--){
    		if(len % i == 0){
    			int m = len / i;
    			String substr = s.substring(0, i);
    			StringBuilder sBuilder = new StringBuilder();
    			for(int j = 0; j < m; j++)
    				sBuilder.append(substr);
    			if(sBuilder.toString().equals(s)) return true;
    		}
    	}
    	return false;
	}
//    public boolean repeatedSubstringPattern(String s) {
//    	int len = s.length();
//          for(int i = len/2; i >= 1; i--){
//        	  if(len % i == 0){
//        		  int p = i, sublen = i;
//            	  String str = s.substring(i), rep = s.substring(0, i);
//            	  while(str.length() >= sublen && str.startsWith(rep)){
//            		  p += sublen;
//            		  if(p == len) return true;
//            		  str = str.substring(sublen);
//            	  }
//        	  }
//          }
//          return false;
//    }
}