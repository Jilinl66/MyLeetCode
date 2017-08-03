package locked;

import java.util.List;

//339. Nested List Weight Sum


public class test339 {
	public interface NestedInteger {

		 // @return true if this NestedInteger holds a single integer, rather than a nested list.
		 public boolean isInteger();
		 
		 // @return the single integer that this NestedInteger holds, if it holds a single integer
		 // Return null if this NestedInteger holds a nested list
		 public Integer getInteger();
		 
		 // @return the nested list that this NestedInteger holds, if it holds a nested list
		 // Return null if this NestedInteger holds a single integer
		 public List<NestedInteger> getList();
	}
    int sum = 0;

    public int depthSum(List<NestedInteger> nestedList) {
        helper(nestedList, 1);
        return sum;
    }
    
    private void helper(List<NestedInteger> nestedIntegers, int depth) {
    	for(NestedInteger nInt: nestedIntegers) {
    		if(nInt.isInteger())
    			sum += depth * nInt.getInteger();
    		else
    			helper(nInt.getList(), depth + 1);
    	}
	}
}
