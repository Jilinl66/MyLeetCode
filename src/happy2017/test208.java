package happy2017;


//208. Implement Trie (Prefix Tree)
public class test208 {
	private TrieNode root;
    /** Initialize your data structure here. */
    public test208() {
        root = new TrieNode();
        root.val = ' ';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode currNode = root;
        for(int i = 0; i < word.length(); i++){
        	char ch = word.charAt(i);
        	if(currNode.children[ch - 'a'] == null){
        		currNode.children[ch - 'a'] = new TrieNode(ch);
        	}
        	currNode = currNode.children[ch - 'a'];
        }
        currNode.isWords = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode currNode = root;
        for(int i = 0; i < word.length(); i++){
        	char ch = word.charAt(i);
        	if(currNode.children[ch - 'a'] == null)
        		return false;
        	currNode = currNode.children[ch - 'a'];
        }
        return currNode.isWords;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode currNode = root;
        for(int i = 0; i < prefix.length(); i++){
        	char ch = prefix.charAt(i);
        	if(currNode.children[ch - 'a'] == null)
        		return false;
        	currNode = currNode.children[ch - 'a'];
        }
        return true;
    }
}

class TrieNode {
	public char val;
	public boolean isWords;
	public TrieNode[] children = new TrieNode[26];
	public TrieNode() {}
	TrieNode(char c) {
		TrieNode node = new TrieNode();
		node.val = c;
	}
}