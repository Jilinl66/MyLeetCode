package happy2017;
//307. Range Sum Query - Mutable
public class test307 {
	class SegmentTreeNode {
		int start, end;
		SegmentTreeNode left, right;
		int sum;
		public SegmentTreeNode(int start, int end) {
			this.start = start;
			this.end = end;
			this.left = null;
			this.right = null;
			this.sum = 0;
		}
	}
	SegmentTreeNode root;
	
    public NumArray(int[] nums) {
        root = buildTree(nums, 0, nums.length - 1);
    }
    
    private SegmentTreeNode buildTree(int[] nums, int start, int end) {
    	if(start > end) return null;
    	SegmentTreeNode subroot = new SegmentTreeNode(start, end);
    	if(start == end)
    		subroot.sum = nums[start];
    	else {
    		int mid = start + (end - start)/2;
    		subroot.left = buildTree(nums, start, mid);
    		subroot.right = buildTree(nums, mid + 1, end);
    		subroot.sum = subroot.left.sum + subroot.right.sum;
    	}
    	return subroot;
	}
    
    public void update(int i, int val) {
    	update(root, i, val);
    }
    
    public void update(SegmentTreeNode root, int pos, int val) {
		if(root.start == root.end)
			root.sum = val; 
		else {
			int mid = root.start + (root.end - root.start)/2;
			if(pos <= mid) {
				update(root.left, pos, val);
			}
			else {
				update(root.right, pos, val);
			}
			root.sum = root.left.sum + root.right.sum;
		}
    }
    
    public int sumRange(int i, int j) {
        return sumRange(root, i, j);
    }
    
    public int sumRange(SegmentTreeNode root, int start, int end) {
		if(root.start == start && root.end == end)
			return root.sum;
		int mid = root.start + (root.end - root.start)/2;
		if(end <= mid) {
			return sumRange(root.left, start, end);
		}
		else if(start >= mid + 1) {
			return sumRange(root.right, start, end);
		}
		else {
			return sumRange(root.left, start, mid) + sumRange(root.right, mid + 1, end);
		}
	}
}
