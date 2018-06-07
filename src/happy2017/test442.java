package happy2017;

import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

//442. Find All Duplicates in an Array
public class test442 {
    public List<Integer> findDuplicates(int[] nums) {
    		List<Integer> res = new ArrayList<>();
    		for (int i = 0; i < nums.length; i++) {
        		int index = Math.abs(nums[i]) - 1;
        		if (nums[index] < 0)
        			res.add(index + 1);
        		else
        			nums[index] *= -1;
        }
        return res;
    }
}
