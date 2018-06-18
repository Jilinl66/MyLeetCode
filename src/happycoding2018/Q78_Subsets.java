package happycoding2018;

import java.util.ArrayList;
import java.util.List;

public class Q78_Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int pos) {
        res.add(new ArrayList<>(list));
        if (list.size() == nums.length) {
            return;
        }
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            helper(res, list, nums, i + 1);
            list.remove(new Integer(nums[i]));
        }
    }
}
