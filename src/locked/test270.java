package locked;

import locked.test156.TreeNode;

//270. Closest Binary Search Tree Value
public class test270 {
	//Recursive
	public int closestValue(TreeNode root, double target) {
		int val1 = root.val;
		TreeNode child = val1 < target? root.right: root.left;
		if(child == null) return val1;
		int val2 = closestValue(child, target);
		return Math.abs(val1 - target) < Math.abs(val2 - target)? val1: val2;
	}
	
	/**
    public int closestValue(TreeNode root, double target) {
    	if(root == null) return (Integer) null;
    	boolean hasUpper = false;
    	boolean hasLower = false;
         int upper = Integer.MAX_VALUE;
         int lower = Integer.MIN_VALUE;
         TreeNode cur = root;
         while(cur != null) {
        	 if(cur.val == target)
        		 return cur.val;
        	 if(target < cur.val) {
            	 upper = Math.min(upper, cur.val);
            	 cur = cur.left;
            	 hasUpper = true;
             }
        	 else {
        		 lower = Math.max(lower, cur.val);
        		 cur = cur.right;
        		 hasLower = true;
        	 }
         }
         if(!hasLower) return upper;
         if(!hasUpper) return lower;
         return target - lower < upper - target? lower: upper;
    }
    **/
}

//Microsoft Google Snapchat