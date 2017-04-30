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
    	if(n == 0)
    		return new ArrayList<TreeNode>();
        return genTree(1, n);
    }
    
    public List<TreeNode> genTree(int start, int end) {
    	List<TreeNode> treeList = new ArrayList<TreeNode>();
    	if(start > end){
    		treeList.add(null);
    		return treeList;
    	}
    	if(start == end){
    		treeList.add(new TreeNode(start));
    		return treeList;
    	}
    	List<TreeNode> left, right;
    	for(int i = start; i <=end; i++){
    		left = genTree(start, i - 1);
    		right = genTree(i + 1, end);
    		for(TreeNode lnode: left){
    			for(TreeNode rnode: right){
	    			TreeNode root = new TreeNode(i);
	    			root.left = lnode;
	    			root.right = rnode;
	    			treeList.add(root);
    			}
    		}
    	}
    	return treeList;
	}
}
