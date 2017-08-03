package happy2017;

import java.util.HashMap;
import java.util.Map;

import happy2017.test101.TreeNode;

//437. Path Sum III 
public class test437 {
	 public int pathSum(TreeNode root, int sum) {
	        HashMap<Integer, Integer> preSum = new HashMap();
	        preSum.put(0,1);
	        return helper(root, 0, sum, preSum);
	    }
	    
	    public int helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
	        if (root == null) {
	            return 0;
	        }
	        
	        currSum += root.val;
	        int res = preSum.getOrDefault(currSum - target, 0);
	        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);
	        
	        res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum);
	        preSum.put(currSum, preSum.get(currSum) - 1);
	        return res;
	    }
//    public int pathSum(TreeNode root, int sum) {
//    	if(root == null) return 0;
//    	return findCurPath(root, sum - root.val) + pathSum(root.left, sum) + pathSum(root.right, sum);
//    }
//    public int findCurPath(TreeNode root, int sum){
//    	int count = 0;
//    	if(root == null) return 0;
//    	if(root.val == sum) count ++;
//    	count += findCurPath(root.left, sum - root.val) + findCurPath(root.right, sum - root.val);
//    	return count;
//    }
}
