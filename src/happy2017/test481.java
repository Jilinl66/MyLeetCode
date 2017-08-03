package happy2017;

//481. Magical String
public class test481 {
    public int magicalString(int n) {
    	if(n == 0) return 0;
    	if(n <= 3) return 1;
        int[] A = new int[n];
        A[0] = 1;
        A[1] = 2;
        A[2] = 2;
        int tail = 3;
        int i = -1;
        boolean flag = false;
        int numOfOnes = 0;
        while(++i < n){
        	flag = !flag;
        	numOfOnes += 2 - A[i];
        	if(i == 0 || i == 1)
        		continue;
        	else if(tail < n){
        		for(int k = 0; k < A[i] && tail < n; k++)
        			A[tail++] = (flag? 1: 2);
        	}
        }
        return numOfOnes;
    }
}