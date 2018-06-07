package happy2017;
import java.util.Stack;

//331. Verify Preorder Serialization of a Binary Tree

public class test331 {
	public boolean isValidSerialization(String preorder) {
		String[] nodes = preorder.split(",");
		int diff = 1;
		for(String node: nodes) {
			if(--diff < 0) return false;
			if(!node.equals("#")) diff += 2;
		}
		return diff == 0;
	}
	
//	public boolean isValidSerialization(String preorder) {
//		if(preorder.length() == 0 || (preorder.length() == 1 && preorder.charAt(0) == '#')) return true;
//		Stack<Character> stack = new Stack<>();
//		char[] c_arr = preorder.toCharArray();
//		for(int i = 0; i < c_arr.length; i++) {
//			char c = c_arr[i];
//			if(c == ',') continue;
//			if(c != '#')
//				stack.push(c);
//			else {
//				if(stack.isEmpty()) return false; 
//				if(stack.peek() != '#') stack.push(c);
//				else {
//					while(!stack.isEmpty() && stack.peek() == '#') {
//						stack.pop();
//						if(stack.isEmpty()) return false;
//						stack.pop();
//					}
//					stack.push('#');
//				}
//			}
//		}
//		return stack.size() == 1 && stack.peek() == '#';
//	}
}