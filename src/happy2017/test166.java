package happy2017;

import java.util.HashMap;

//166. Fraction to Recurring Decimal
public class test166 {
    public String fractionToDecimal(int numerator, int denominator) {
       if(numerator == 0) return "0";
       StringBuilder sBuilder = new StringBuilder();
       sBuilder.append(((numerator > 0) ^ (denominator > 0))? "-": "");
       long num = Math.abs((long)numerator); //convert to long first!!!
       long den = Math.abs((long)denominator);
       sBuilder.append(num/den);
       num %= den;
       if(num == 0) return sBuilder.toString();
       
       sBuilder.append(".");
       HashMap<Long, Integer> map = new HashMap<>();
       map.put(num, sBuilder.length());
       while(num != 0){
    	   num *= 10;
    	   sBuilder.append(num / den);
//    	   System.out.println(sBuilder.toString());
    	   num %= den;
    	   if(map.containsKey(num)){
    		   int index = map.get(num);
    		   sBuilder.insert(index, "(");
    		   sBuilder.append(")");
    		   break;
    	   }
    	   else
    		   map.put(num, sBuilder.length());
       }
       return sBuilder.toString();
    }
}
