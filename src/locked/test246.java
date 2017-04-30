//246. Strobogrammatic Number 
package locked;

public class test246 {
    public boolean isStrobogrammatic(String num) {
    	String s = "11 88 696 00";
       for(int i = 0, j = num.length() - 1; i <= j; i++, j--) {
    	   if(!s.contains(num.charAt(i) + "" + num.charAt(j)))
    		   return false;
       }
       return true;
    }
}

//Google