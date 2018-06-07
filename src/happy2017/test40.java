package happy2017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//40. Combination Sum II
public class test40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	List<List<Integer>> res = new ArrayList<>();
    	Arrays.sort(candidates);
        if(candidates.length == 0) return res;
        backtracking(candidates, target, new ArrayList<>(), res, 0, 0);
        return res;
    }
    private void backtracking(int[] candidates, int target, ArrayList<Integer> list, List<List<Integer>> res, int sum, int pos) {
    	if(sum >= target) {
    		if(sum == target) res.add(list);
    		return;
    	}
    	for(int i = pos; i < candidates.length; i++) {
    		list.add(candidates[i]);
    		backtracking(candidates, target, new ArrayList<>(list), res, sum + candidates[i], i + 1);
    		while(i + 1 < candidates.length && candidates[i] == candidates[i + 1]) i++;
    		list.remove(list.size() - 1);
    	}
	}
}