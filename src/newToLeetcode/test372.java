package newToLeetcode;
//372. Super Pow

public class test372 {

	public static void main(String[] args) {
		test372 t6 = new test372();
		int[] b = {1, 0};
		System.out.println(t6.superPow(2, b));
	}

	public int superPow(int a, int[] b) {
    	int index = arrayToNumber(b);
    	int count = computeMaxIndex(a);
        int div = a;
        int reminder = 0;
        if (count >= index){
        	reminder = (int) (Math.pow(a, index) % 1337);
        	return reminder;
        }
        else{
        	div = (int) Math.pow(a, count);
        	while(index > 0){
    	        reminder = div % 1337;
    	        div = div * reminder;
        	}
        }
    	
    	System.out.println("finsh");
    	return reminder;
   
    }
	private int arrayToNumber(int[] b) {
		int B = 0;
       	for (int i = 0; i < b.length; i++){
    		B = B * 10 + b[i];
    	}
       	return B;
	}
	
	private int computeMaxIndex(int a){
		int divisor = a;
		int count = 1;
		while(divisor < Integer.MAX_VALUE){
			divisor = divisor * a;
			count ++;
		}
		return count;
	}
}
