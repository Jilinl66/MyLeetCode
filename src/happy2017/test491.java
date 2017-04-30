package happy2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//491. Increasing Subsequences
public class test491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
    	Set<List<Integer>> resSet = new HashSet<List<Integer>>();
    	DFS(nums, resSet, new ArrayList<Integer>(), 0); 	
    	return new ArrayList<>(resSet);
    }
    
    private void DFS(int[] nums, Set<List<Integer>> res, ArrayList<Integer> list, int pos){
    	if(list.size() >= 2)
    		res.add(new ArrayList<>(list));
    	for(int i = pos; i < nums.length; i++){
    		if(list.size() == 0 || list.get(list.size() - 1) <= nums[i]){
    			list.add(nums[i]);
        		DFS(nums, res, new ArrayList<>(list), i + 1);
        		list.remove(list.size() - 1);     
    		}	
    	}
    }
}
                          