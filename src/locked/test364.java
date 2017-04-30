package locked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//364. Nested List Weight Sum II
public class test364 {
	 public interface NestedInteger {
		// Constructor initializes an empty nested list.
		public NestedInteger();
		
		// Constructor initializes a single integer.
		public NestedInteger(int value);
		
		// @return true if this NestedInteger holds a single integer, rather than a nested list.
		public boolean isInteger();
			 
		// @return the single integer that this NestedInteger holds, if it holds a single integer
		// Return null if this NestedInteger holds a nested list
		public Integer getInteger();
		
		// Set this NestedInteger to hold a single integer.
		 public void setInteger(int value);
		
		// Set this NestedInteger to hold a nested list and adds a nested integer to it.
		public void add(NestedInteger ni);
		
		// @return the nested list that this NestedInteger holds, if it holds a nested list
		// Return null if this NestedInteger holds a single integer
		public List<NestedInteger> getList();
	
	}
	 
	 public int depthSumInverse(List<NestedInteger> nestedList) {
		 Queue<NestedInteger> queue = new LinkedList<>();
		 int pre = 0;
		 int total = 0;
		 for(NestedInteger nInteger: nestedList) {
			 queue.add(nInteger);
		 }
		 while(!queue.isEmpty()) {
			 int size = queue.size();
			 for(int i = 0; i < size; i++) {
				 NestedInteger cur = queue.poll();
				 if(cur.isInteger())
					 pre += cur.getInteger();
				 else {
					 List<NestedInteger> list = cur.getList();
					 for(NestedInteger nInteger: list) {
						 queue.offer(nInteger);
					 }
				 }
			 }
			 total += pre;
		 }
		 return total;
	 }
	 
	/**
	 public int depthSumInverse(List<NestedInteger> nestedList) {
		 int unweighted = 0, weighted = 0;
		 while(!nestedList.isEmpty()) {
			 List<NestedInteger> nextLevel = new ArrayList<>();
			 for(NestedInteger nInteger: nestedList) {
				 if(nInteger.isInteger()) {
					 unweighted += nInteger.getInteger();
				 }
				 else {
					 nextLevel.addAll(nInteger.getList());
				 }
			 }
			 weighted += unweighted;
			 nestedList = nextLevel;
		 }
		 return weighted;
	 }
	 **/
	 
	 /**
	int sum = 0;
	
    public int depthSumInverse(List<NestedInteger> nestedList) {
        dfs(nestedList);
        return sum;
    }
    
    private int dfs(List<NestedInteger> nestedList) {
    	int s = 0;
    	int depth = 0;
    	for(NestedInteger nInteger: nestedList) {
    		if(nInteger.isInteger()) {
    			s += nInteger.getInteger();
    		}
    		else{
    			depth = Math.max(depth, dfs(nInteger.getList()));
    		}
    	}
    	depth++;
    	sum += s * depth;
    	return depth;
    }
    **/
}
