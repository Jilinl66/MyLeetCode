package happy2017;

import java.util.Stack;

//
public class test385 {
//    public NestedInteger deserialize(String s) {
//        if(s.isEmpty()) return null;
//        if(s.charAt(0) != '[') return new NestedInteger(Integer.parseInt(s));
//        Stack<NestedInteger> stack = new Stack<>();
//        NestedInteger cur = null;
//        int l = 0;
//        for (int r = 0; r < s.length(); r++) {
//        	char ch = s.charAt(r);
//			if(ch == '['){
//				if(cur != null)
//					stack.push(cur);
//				cur = new NestedInteger();
//				l = r + 1;
//			}
//			else if(ch == ']'){
//				String num = s.substring(l, r);
//				if(!num.isEmpty())
//					cur.add(new NestedInteger(Integer.valueOf(num)));
//				if(!stack.isEmpty()){
//					NestedInteger pop = stack.pop();
//					pop.add(cur);
//					cur = pop;
//				}
//				l = r + 1;
//			}
//			else if(ch == ','){
//				if(s.charAt(r - 1) != ']'){
//					String num = s.substring(l, r);
//					cur.add(new NestedInteger(Integer.parseInt(num)));
//				}
//				l = r + 1;
//			}
//		}
//        return cur;
//    }
//    
//    public interface NestedInteger {
//   	 // Constructor initializes an empty nested list.
//   	 public NestedInteger();
//
//   	 // Constructor initializes a single integer.
//   	 public NestedInteger(int value);
//   	 
//   	 // @return true if this NestedInteger holds a single integer, rather than a nested list.
//   	 public boolean isInteger();
//   	 
//   	 // @return the single integer that this NestedInteger holds, if it holds a single integer
//   	 // Return null if this NestedInteger holds a nested list
//   	 public Integer getInteger();
//   	 
//   	 // Set this NestedInteger to hold a single integer.
//   	 public void setInteger(int value);
//   	 
//   	 // Set this NestedInteger to hold a nested list and adds a nested integer to it.
//   	 public void add(NestedInteger ni);
//   	 
//   	 // @return the nested list that this NestedInteger holds, if it holds a nested list
//   	 // Return null if this NestedInteger holds a single integer
//   	 public List<NestedInteger> getList();
//   }
}
