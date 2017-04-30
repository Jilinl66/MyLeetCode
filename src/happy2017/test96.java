package happy2017;

import java.util.ArrayList;
import java.util.List;

//96. Unique Binary Search Trees
public class test96 {
	List<Integer> mem = new ArrayList<Integer>();
	
    public int numTrees(int n) {
    	if(mem.isEmpty()){
    		mem.add(0, 0);
    		mem.add(1, 1);
    		mem.add(2, 2);
    	}
    	if(n == 1)
    		return 1;
    	if(n == 2)
    		return 2;
    	int count = 0;
		count += 2* numTrees(n - 1);
        for(int i = 1; i < n - 1; i++)
        	count += (mem.get(n - 1 - i)!= 0? mem.get(n - 1 - i) :numTrees(n - 1 - i)) * (mem.get(i) != 0? mem.get(i) :numTrees(i));
        mem.add(n, count);
        return count;
    }
}
