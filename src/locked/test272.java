package locked;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import locked.test156.TreeNode;

//272. Closest Binary Search Tree Value II
public class test272 {
	//inorder trrverse, important!
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> sPre = new Stack<>();
        Stack<Integer> sPos = new Stack<>();
        inorder(root, target, false, sPre);
        inorder(root, target, true, sPos);
        while(k-- > 0) {
        	if(sPre.isEmpty())
        		res.add(sPos.pop());
        	else if(sPos.isEmpty()){
        		res.add(sPre.pop());
        	}
        	else if(Math.abs(sPos.peek() - target) < Math.abs(sPre.peek() - target)) {
        		res.add(sPos.pop());
        	}
        	else
        		res.add(sPre.pop());
        }
        return res;
    }
    
    public void inorder (TreeNode root, double target, boolean reverse, Stack<Integer> stack) {
		if(root == null) return;
		inorder(reverse? root.right: root.left, target, reverse, stack);
		if((reverse && root.val <= target) || (!reverse && root.val > target)) return;
		stack.push(root.val);
		inorder(reverse? root.left: root.right, target, reverse, stack);
	}
}
  