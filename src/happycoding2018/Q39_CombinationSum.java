package happycoding2018;

import java.util.ArrayList;
import java.util.List;

public class Q39_CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        helper(res, new ArrayList<>(), 0, candidates, target, 0);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, int sum, int[] candidates, int target, int p) {
        if (sum >= target) {
            if (sum == target) {
                res.add(new ArrayList<>(list)); // Add Copy value!!!
            }
            return;
        }
        for (int i = p; i < candidates.length; i++) {
            int number = candidates[i];
            list.add(number);
            helper(res, list, sum + number, candidates, target, i);
            list.remove(new Integer(number));
        }
    }
    
}
