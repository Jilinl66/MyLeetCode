package happy2017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//39. Combination Sum
public class test39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(target <= 0) return null;
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        backtracking(candidates, target, new ArrayList<>(), set, 0, 0);
    	return new ArrayList<>(set);
    }
    private void backtracking(int[] candidates, int target, List<Integer> list, Set<List<Integer>> set, int sum, int pos) {
    	if(sum > target) return;
    	if(sum == target) {
    		set.add(list);
    		return;
    	}
		for(int i = pos; i < candidates.length; i++) {
			list.add(candidates[i]);
			backtracking(candidates, target, new ArrayList<>(list), set, sum + candidates[i], i);
			list.remove(list.size() - 1);
		}
	}
}
