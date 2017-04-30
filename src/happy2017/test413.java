package happy2017;
///413. Arithmetic Slices
public class test413 {
    public int numberOfArithmeticSlices(int[] A) {
        int cur = 0, sum = 0;
        for(int i = 2; i < A.length; i++){
        	if(A[i] - A[i - 1] == A[i - 1] - A[i - 2])
        		sum += ++cur;
        	else
        		cur = 0;
        }
        return sum;
    }
}
