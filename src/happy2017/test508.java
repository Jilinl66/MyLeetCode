package happy2017;

import java.util.ArrayList;
import java.util.HashMap;

//508. Most Frequent Subtree Sum
public class test508 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    int max = Integer.MIN_VALUE;

    public int[] findFrequentTreeSum(TreeNode root) {
        ArrayList<Integer> resArr = new ArrayList<>();
         if(root == null) 
        	 return new int[0];
         HashMap<Integer, Integer> map = new HashMap<>();
         subtreeSum(root, map);
         for(int k: map.keySet()){
        	 if(map.get(k) == max)
        		 resArr.add(k);
         }
         int[] res = new int[resArr.size()];
         for(int i = 0; i < resArr.size(); i++)
        	 res[i] = resArr.get(i);
         return res;
    }
    private int subtreeSum(TreeNode root, HashMap<Integer, Integer> map) {
    	if(root == null)
    		return 0;
		int sum = root.val + subtreeSum(root.left, map) + subtreeSum(root.right, map);
		map.put(sum, map.getOrDefault(sum, 0) + 1);
		max = Math.max(max, map.get(sum));
		return sum;
	}
}
