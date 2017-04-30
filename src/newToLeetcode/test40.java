package newToLeetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//40. Combination Sum II
public class test40 {
	 public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(candidates);
	        backtracking(result, new ArrayList<>(), candidates, target, 0);
	        return result;
	 }
	 
	 private void backtracking(List<List<Integer>> list, ArrayList<Integer> templist, int[] nums, int remain, int start) {
		 if(remain < 0)
			 return;
		 else if(remain == 0)
			 list.add(new ArrayList<>(templist));
		 else{
			 for(int i = start; i < nums.length; i++){
				 if(i > start && nums[i] == nums[i-1])
					 continue;
				 templist.add(nums[i]);
				 backtracking(list, templist, nums, remain - nums[i], i + 1);
				 templist.remove(templist.size() - 1);
			 }
		 }
	 }
}
