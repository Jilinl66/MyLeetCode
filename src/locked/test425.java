package locked;

import java.util.ArrayList;
import java.util.List;

//425. Word Squares
public class test425 {
    class TrieNode {
    	List<String> startWith;
    	TrieNode[] children;
    	public TrieNode() {
			startWith = new ArrayList<>();
			children = new TrieNode[26];
		}
    }
    
    class Trie {
    	TrieNode root;
    	Trie(String[] words) {
			root = new TrieNode();
			for(String word: words) {
				TrieNode cur = root;
				for(char c: word.toCharArray()) {
					int index = c - 'a';
					if(cur.children[index] == null)
						cur.children[index] = new TrieNode();
					cur.children[index].startWith.add(word);
					cur = cur.children[index];
				}
			}
		}
    	List<String> findByPrefix(String prefix) {
    		List<String> resList = new ArrayList<>();
    		TrieNode cur = root;
    		for(char c: prefix.toCharArray()) {
    			int index = c - 'a';
    			if(cur.children[index] == null)
    				return resList;
    			cur = cur.children[index];
    		}
    		resList.addAll(cur.startWith);
    		return resList;
    	}
    }

    public List<List<String>> wordSquares(String[] words) {
    	List<List<String>> res = new ArrayList<>();
    	if(words == null || words.length == 0)
    		return res;
    	int len = words[0].length();
    	Trie trie = new Trie(words);
    	List<String> ansBuilder = new ArrayList<>();
    	for(String word: words) {
    		ansBuilder.add(word);
    		search(res, ansBuilder, len, trie);
    		ansBuilder.remove(ansBuilder.size() - 1);
    	}
    	return res;
    }
    
    private void search(List<List<String>> res, List<String> ansBuilder, int len, Trie trie) {
    	if(ansBuilder.size() == len) {
    		res.add(new ArrayList<>(ansBuilder));
    		return;
    	}
    	int idx = ansBuilder.size();
    	StringBuilder prefixBuilder = new StringBuilder();
    	for(String s: ansBuilder)
    		prefixBuilder.append(s.charAt(idx));
    	List<String> startWith = trie.findByPrefix(prefixBuilder.toString());
    	for(String s: startWith) {
    		ansBuilder.add(s);
    		search(res, ansBuilder, len, trie);
    		ansBuilder.remove(ansBuilder.size() - 1);
    	}
    }
}
