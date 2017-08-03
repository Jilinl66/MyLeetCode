package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//47. Permutations II
//DFS
public class test47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	boolean[] visited = new boolean[nums.length];
    	Arrays.sort(nums);
    	backtracking(res, new ArrayList<Integer>(), visited, nums);
    	return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> list, boolean[] visited, int[] nums){
    	if(list.size() == nums.length) {
    		res.add(list);
    		return;
    	}
    	for(int i = 0; i < nums.length; i++) {
    		if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
    		if(!visited[i]) {
    			list.add(nums[i]);
    			visited[i] = true;
    			backtracking(res, new ArrayList<>(list), visited, nums);
    			visited[i] = false;
    			list.remove(list.size() - 1);
    		}
    	}
    };
}
