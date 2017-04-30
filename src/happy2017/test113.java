package happy2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import happy2017.test101.TreeNode;

//113. Path Sum II
public class test113 {
	List<List<Integer>> resList = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	if(root == null) return resList;
    	Stack<Integer> path = new Stack<>();
    	helper(root, sum, path);
    	return resList;
    }
    
    public void helper(TreeNode root, int sum, Stack<Integer> path) {
    	if(root == null) return;
    	path.push(root.val);
    	if(root.left == null && root.right == null && sum == root.val)
    		 resList.add(new ArrayList<Integer>(path)); 
    	helper(root.left, sum - root.val, path);
    	helper(root.right, sum - root.val, path);
    	path.pop();
	}
}
