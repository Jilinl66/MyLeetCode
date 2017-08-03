package locked;

import java.util.ArrayList;
import java.util.List;

//254. Factor Combinations
public class test254 {
    public List<List<Integer>> getFactors(int n) {
    	List<List<Integer>> res = new ArrayList<>();
    	backtracking(res, new ArrayList<>(), n, 2);
    	return res;
    }
    
    public void backtracking(List<List<Integer>> res, ArrayList<Integer> list, int n, int start) {
		if(n <= 1) {
			if(list.size() >= 2) 
				res.add(list);
			return;
		}
		for(int i = start; i <= n; i++) {
			if(n % i != 0) continue;
			list.add(i);
			backtracking(res, new ArrayList<>(list), n/i, i);
			list.remove(list.size() - 1);
		}
	}
}

//LinkedIn Uber
//backtracking