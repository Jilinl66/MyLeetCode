package happy2017;

//421. Maximum XOR of Two Numbers in an Array
public class test421 {
	class TrieNode {
        TrieNode[] children;
        public TrieNode() {
            children = new TrieNode[2];
        }
    }
    public int findMaximumXOR(int[] nums) {
    	if(nums.length == 0) return 0;
    	TrieNode root = new TrieNode();
    	for(int num: nums){
    		TrieNode cur = root;
    		for(int i = 31; i >= 0; i--){
    			int bit = (num >>> i) & i;
    			if(cur.children[bit] == null)
    				cur.children[bit] = new TrieNode();
    			cur = cur.children[bit];
    		}
    	}
    	int max = 0;
    	for(int num: nums){
    		TrieNode cur = root;
    		int curSum = 0;
    		for(int i = 31; i >= 0; i--){
    			int bit = (num >>> i) & 1;
    			if(cur.children[bit ^ 1] != null){
    				curSum += (1 << i);
    				cur = cur.children[bit ^ 1];
    			}
    			else
    				cur = cur.children[bit];
    		}
    		max = Math.max(curSum, max);
    	}
    	return max;
    }
}
