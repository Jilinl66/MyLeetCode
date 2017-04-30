package happy2017;
//396. Rotate Function
public class test396 {
    public int maxRotateFunction(int[] A) {
    	if(A.length == 0) return 0;
    	int max = Integer.MIN_VALUE, funcSum = 0, sumOfA = 0, n = A.length;
    	for(int i: A)
    		sumOfA += i;
    	for(int i = 0; i < n; i++)
    		funcSum += A[i] * i;
    	for(int i = n - 1; i >= 0; i--){
    		funcSum = funcSum - n * A[i] + sumOfA;
    		max = Math.max(max, funcSum);
    	}
    	return max;
    }
}
