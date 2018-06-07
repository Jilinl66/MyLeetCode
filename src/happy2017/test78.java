package happy2017;

import java.util.ArrayList;
import java.util.List;

//78. Subsets
public class test78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		backtracking(nums, 0, new ArrayList<>(), res);
		return res;
    }
	
	private void backtracking(int[] nums, int pos, List<Integer> list, List<List<Integer>> res) {
		if(pos == nums.length) {
			res.add(list);
			return;
		}
		backtracking(nums, pos + 1, new ArrayList<>(list), res);
		list.add(nums[pos]);
		backtracking(nums, pos + 1, new ArrayList<>(list), res);
	}
}
