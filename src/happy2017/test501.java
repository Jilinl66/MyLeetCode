package happy2017;
// 501. Find Mode in Binary Search Tree

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import happy2017.test101.TreeNode;

public class test501 {
	Map<Integer, Integer> map = new HashMap<>();
	int mode = 0;
    public int[] findMode(TreeNode root) {
    	if(root == null) return new int[0];
    	inorder(root);
    	List<Integer> modelist = new ArrayList<>();
    	for(int key: map.keySet())
    		if(map.get(key) == mode)
    			modelist.add(key);
    	int[] res = new int[modelist.size()];
    	for(int i = 0; i< modelist.size(); i++)
    		res[i] = modelist.get(i);
    	return res;
    }
    
    public void inorder(TreeNode root) {
		if(root.left != null)
			inorder(root.left);
		map.put(root.val, map.getOrDefault(root.val, 0) + 1);
		mode = Math.max(mode, map.get(root.val));
		if(root.right != null)
			inorder(root.right);
	}
}
