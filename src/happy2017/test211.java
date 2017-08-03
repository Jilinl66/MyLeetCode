package happy2017;
//211. Add and Search Word - Data structure design
public class test211 {
	public class TrieNode {
		TrieNode[] children = new TrieNode[26];
		String word = "";
	}
	TrieNode root;
	
    /** Initialize your data structure here. */
    public test211() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode cur = root;
        for(char c: word.toCharArray()){
        	if(cur.children[c - 'a'] == null)
        		cur.children[c - 'a'] = new TrieNode();
        	cur = cur.children[c - 'a'];
        }
        cur.word = word;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchHelper(word.toCharArray(), 0, root);
    }
    
    private boolean searchHelper(char[] chars, int pos, TrieNode node) {
		if(pos == chars.length) return node.word != "";
		if(chars[pos] != '.'){
			return node.children[chars[pos] - 'a'] != null && searchHelper(chars, pos + 1, node.children[chars[pos] - 'a']);
		}
		else{
			for(int i = 0; i < node.children.length; i++){
				if(node.children[i] != null){
					if(searchHelper(chars, pos + 1, node.children[i]))
						return true;
				}
			}
		}
		return false;
	}
}
