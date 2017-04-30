package newToLeetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//39. Combination Sum
public class test39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> result = new ArrayList<>();
    	Arrays.sort(candidates);
    	backtracking(result, new ArrayList<>(), candidates, target, 0);
    	return result;
    }
    
    private void backtracking(List<List<Integer>> list, List<Integer> templist, int[] nums, int remain, int start) {
		if(remain < 0)
			return;
		else if(remain == 0)
			list.add(new ArrayList<>(templist));
		else{
			for(int i = start; i< nums.length; i++){
				templist.add(nums[i]);
				backtracking(list, templist, nums, remain - nums[i], i);
				templist.remove(templist.size() - 1);
			}
		}
	}
}
