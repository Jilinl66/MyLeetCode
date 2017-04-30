package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//47. Permutations II
//DFS
public class test47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(nums == null || nums.length == 0) return res;
    	List<Integer> list = new ArrayList<>();
    	boolean[] visited = new boolean[nums.length];
    	Arrays.sort(nums);
    	dfs(nums, visited, res, list);
    	return res;
    }
    
    private void dfs(int[] nums, boolean[] v, List<List<Integer>> res, List<Integer> list){
    	if(list.size() == nums.length){
    		res.add(new ArrayList<>(list));
    		return;
    	}
    	
    	for(int i = 0; i < nums.length; i++){
    		if(v[i]) continue;
    		if(i > 0 && nums[i] == nums[i - 1] && !v[i - 1]) continue;
    		list.add(nums[i]);
    		v[i] = true;
    		dfs(nums, v, res, list);
    		v[i] = false;
    		list.remove(list.size() - 1);
    	}
    }
}
