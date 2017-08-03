package happy2017;

import java.util.ArrayList;
import java.util.List;

//95. Unique Binary Search Trees II
public class test95 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
    public List<TreeNode> generateTrees(int n) {
    	List<TreeNode> res = new ArrayList<>();
    	if(n == 0) return res;
    	return generateSubTree(1, n);
    }
    
    private List<TreeNode> generateSubTree(int start, int end) {
    	List<TreeNode> list = new ArrayList<>();
    	if(start > end) {
    		list.add(null);
    		return list;
    	}
    	for(int i = start; i <= end; i++) {
    		for(TreeNode leftChild: generateSubTree(start, i - 1)) {
    			for(TreeNode rightChild: generateSubTree(i + 1, end)) {
    				TreeNode root = new TreeNode(i);
    				root.left = leftChild;
    				root.right = rightChild;
    				list.add(root);
    			}
    		}
    	}
    	return list;
    }
}
