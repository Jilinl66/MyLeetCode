package happy2017;

import java.util.ArrayList;
import java.util.List;

import happy2017.test101.TreeNode;

//257. Binary Tree Paths
public class test257 {
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> reStrings = new ArrayList<String>();
    	if(root != null) searchBtree(root, "", reStrings);
    	return reStrings;
    }
    
    public void searchBtree(TreeNode node, String path, List<String> rs){
    	if(node.left == null && node.right == null) rs.add(path + node.val);
    	if(node.left != null) searchBtree(node.left, path + node.val + "->", rs);
    	if(node.right != null) searchBtree(node.right, path + node.val + "->", rs);
    }
}
