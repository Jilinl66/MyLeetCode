package happy2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import happy2017.test101.TreeNode;

//113. Path Sum II
public class test113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(root == null) return res;
    	findPath(res, new ArrayList<>(), root, sum);
    	return res;
    }
    
    private void findPath(List<List<Integer>> res, List<Integer> list, TreeNode root, int remain) {
    	if(root == null) return;
    	if(root.left == null && root.right == null) {
    		if(remain == root.val) {
    			list.add(root.val);
    			res.add(list);
    		}
    		return;
    	}
    	list.add(root.val);
    	findPath(res, new ArrayList<>(list), root.left, remain - root.val);
    	findPath(res, new ArrayList<>(list), root.right, remain - root.val);
	}
}
