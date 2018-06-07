package happy2017;

import java.util.ArrayList;
import java.util.List;

//448. Find All Numbers Disappeared in an Array 
public class test448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    		List<Integer> res = new ArrayList<>();
    		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0)
				nums[index] *= -1;
		}
    		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0)
				res.add(i + 1);
		}
    		return res;
    }
}
