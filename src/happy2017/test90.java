package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//90. Subsets II
public class test90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> each = new ArrayList<>();
        helper(res, each, 0, nums);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> each, int pos, int[] A){
    	if(pos <= A.length)
    		res.add(each);
    	int i = pos;
    	while(i < A.length){
    		each.add(A[i]);
    		helper(res, new ArrayList<>(each), i + 1, A);
    		each.remove(each.size() - 1);
    		i++;
    		while(i < A.length && A[i] == A[i - 1])
    			i++;
    	}
    }
}
