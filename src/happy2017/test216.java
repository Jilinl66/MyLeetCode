package happy2017;
import java.util.ArrayList;
import java.util.List;

//216. Combination Sum III

public class test216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(k == 0 || n == 0) return res;
    	backtracking(res, new ArrayList<>(), 1, k, n);
    	return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> list, int pos, int k, int n) {
    	if(k == 0 && n == 0) {
    		res.add(list);
    		return;
    	}
    	for(int i = pos; i <= 9; i++) {
    		if(i > n || k < 0) break;
			list.add(i);
			backtracking(res, new ArrayList<>(list), i + 1, k - 1, n - i);
			list.remove(list.size() - 1);
    	}
	}
}
