package newToLeetcode;
//264. Ugly Number II
public class test264 {
    public int nthUglyNumber(int n) {
    	int[] ugly = new int[n];
    	int min;
    	ugly[0] = 1;
    	int index2 = 0, index3 = 0, index5 = 0;
    	int factor2 = 2, factor3 = 3, factor5 = 5;
    	for(int i = 1; i < n; i++){
    		min = Math.min(Math.min(factor2, factor3), factor5);
    		ugly[i] = min;
    		if(min == factor2){
    			index2++;
    			factor2 = 2 * ugly[index2];
    		}
    		if(min == factor3){
    			index3++;
    			factor3 = 3 * ugly[index3];
    		}
    		if(min == factor5){
    			index5++;
    			factor5 = 5 * ugly[index5];
    		}
    	}
		return ugly[n - 1];
    }

}
