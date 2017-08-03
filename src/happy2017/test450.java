package happy2017;
//450. Delete Node in a BST  
public class test450 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public TreeNode deleteNode(TreeNode root, int key) {
    	if(root == null) return null;
    	if(key < root.val) root.left = deleteNode(root.left, key);
    	else if(key > root.val) root.right = deleteNode(root.right, key);
    	else {
    		if(root.left == null)
    			return root.right;
    		else if(root.right == null)
    			return root.left;
    		TreeNode minNode = findMin(root.right);
    		root.val = minNode.val;
    		root.right = deleteNode(root.right, minNode.val);
    	}
    	return root;
    }
	
	private TreeNode findMin(TreeNode root) {
		while(root.left != null)
			root = root.left;
		return root;
	}
	
//    public TreeNode deleteNode(TreeNode root, int key) {
//    	TreeNode curnode = root;
//    	TreeNode delNode;
//        while(curnode != null && curnode.val != key){
//        	if(key < curnode.val)
//        		curnode = curnode.left;
//        	else
//        		curnode = curnode.right;
//        }
//        if(curnode.val != key)
//        	return root;
//        delNode = curnode;
//	    if(curnode.left == null) {
//		   if(curnode.right == null)
//			   return root;
//		   else{
//			   curnode = curnode.right;
//			   while(curnode != null && curnode.right != null)
//				   curnode = curnode.left;
//		   }
//	   }
//	   else{
//	    curnode = curnode.left;
//	    while(curnode != null && curnode.right != null)
//	    	curnode = curnode.right;
//	   }
//	    delNode.val = curnode.val;
//	    curnode = null;
//	    return root;
//    }
}
