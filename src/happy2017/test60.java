package happy2017;

import java.util.ArrayList;
import java.util.List;

//60. Permutation Sequence
public class test60 {
    public String getPermutation(int n, int k) {
    	List<Integer> nums = new ArrayList<>();
    	int[] factorial = new int[n + 1];
    	StringBuilder sBuilder = new StringBuilder();
    	int sum = 1;
    	factorial[0] = 1;
    	for(int i = 1; i <= n; i++) {
    		sum *= i;
    		factorial[i] = sum;
    	}
    	for(int i = 1; i <= n; i++)
    		nums.add(i);
    	k--;
    	for(int i = 1; i <= n; i++) {
    		int index = k / factorial[n - i];
    		System.out.println(index);
    		sBuilder.append(nums.get(index));
    		nums.remove(index);
    		k %= factorial[n - i];
    		System.out.println(k);
    	}
    	return sBuilder.toString();
    }
}
 