package newToLeetcode;
import java.util.Stack;

//331. Verify Preorder Serialization of a Binary Tree

public class test331 {
	public boolean isValidSerialization(String preorder) {
        if (preorder == null)
        	return false;
        Stack<String> stack = new Stack<String>();
        String[] nodes = preorder.split(",");
        for(int i = 0; i < nodes.length; i++){
        	String curnode = nodes[i];
        	while(curnode.equals("#") && !stack.empty() && stack.peek().equals("#")){
        		stack.pop();
        		if(stack.isEmpty()){
        			return false;
        		}
        		stack.pop();
        	}
        	stack.push(curnode);
        }
        return stack.size() == 1 && stack.peek().equals("#");
    }
}

// Calculate outdegree and indegree
//public class test331 {
//	public boolean isValidSerialization(String preorder) {
//		int diff = 1;
//		String[] nodes = preorder.split(",");
//		for (int i = 0; i < nodes.length; i++){
//				diff--;
//				if(diff < 0) return false;
//			if(!nodes[i].equals("#")) diff++;
//		}
//		return diff == 0;
//	}
//}