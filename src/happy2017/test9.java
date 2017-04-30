package happy2017;
//9. Palindrome Number
public class test9 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(1001));
	}
	
    public static boolean isPalindrome(int x) {
    	if(x < 0)
    		return false;
        int numOfByte = 1;
        int y = x;
        while(y/10 != 0){
        	numOfByte ++;
        	y /= 10;
        }
        int count = numOfByte/2;
        int factor = numOfByte - 1;
        while(count > 0){
        	if((x/(int)Math.pow(10, factor)) % 10 != x % 10)
        		return false;
        	x /= 10;
        	factor-=2;
        	count--;
        }	
        return true;
    }
}