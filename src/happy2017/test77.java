package happy2017;

import java.util.ArrayList;
import java.util.List;

//77. Combinations
public class test77 {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> res = new ArrayList<>();
    	List<Integer> each = new ArrayList<>();
    	int[] numbers = new int[n];
    	for(int i = 0; i < n; i++)
    		numbers[i] = i + 1;
    	helper(res, numbers, 0, each, k);
    	return res;
    }
    
    private void helper(List<List<Integer>> res, int[] numbers, int pos, List<Integer> each, int k) {
		if(each.size() == k)
			res.add(each);
		int i = pos;
		while(i < numbers.length){
			each.add(numbers[i]);
			helper(res, numbers, i + 1, new ArrayList<>(each), k);
			each.remove(each.size() - 1);
			i++;
		}
	}
}
