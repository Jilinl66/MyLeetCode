package happy2017;

import java.util.ArrayList;
import java.util.List;

//60. Permutation Sequence
public class test60 {
    public String getPermutation(int n, int k) {
    	List<Integer> numList = new ArrayList<>();
    	StringBuilder res = new StringBuilder();
    	int[] factorials = new int[n + 1];
        factorials[0] = 1;
        for(int i = 1; i <=n; i++)
        	factorials[i] = factorials[i - 1] * i;
        for(int i = 1; i <= n; i++)
        	numList.add(i);
        k--;
        for(int i = 1; i <=n; i++){
        	int index = k / factorials[n - i];
        	res.append(String.valueOf(numList.get(index)));
        	numList.remove(index);
        	k -= index * factorials[n - i];
        }
        return res.toString();
    }
}
 