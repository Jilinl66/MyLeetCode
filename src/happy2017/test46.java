package happy2017;

import java.util.ArrayList;
import java.util.List;

//46. Permutations
public class test46 {
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	backtracking(res, new ArrayList<>(), nums, new boolean[nums.length]);
    	return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] visited) {
    	if(list.size() == nums.length) {
    		res.add(list);
    		return;
    	}
    	for(int i = 0; i < nums.length; i++) {
    		if(!visited[i]) {
    			list.add(nums[i]);
    			visited[i] = true;
    			backtracking(res, new ArrayList<>(list), nums, visited);
    			visited[i] = false;
    			list.remove(list.size() - 1);
    		}
    	}
    }
}

/**  LinkedIn Microsoft
 */
