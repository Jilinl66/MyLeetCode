package newToLeetcode;
//7. Reverse Integer
public class test7 {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		int x =1534236469;
		long result = 0;
	    while(x != 0){
	    	System.out.println("x:" + x);
	        result = result*10 + x % 10;
	        System.out.println("result:" + result);
	        x = x/10;
	        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
	            System.out.print(0);
	    }
	    System.out.println(result * 100);
	}
}