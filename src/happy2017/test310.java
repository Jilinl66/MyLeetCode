package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//310. Minimum Height Trees
public class test310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    	if(n == 1) return new ArrayList<>(Arrays.asList(0));
        List<Set<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        	list.add(new HashSet<>());
        for(int[] edge: edges){
        	list.get(edge[0]).add(edge[1]);
        	list.get(edge[1]).add(edge[0]);
        }
        List<Integer> leaves = new ArrayList<>();
        for(int i = 0; i < n; i++)
        	if(list.get(i).size() == 1)
        		leaves.add(i);
        while(n > 2){
        	n -= leaves.size();
        	List<Integer> newLeaves = new ArrayList<>();
        	for(int leave: leaves){
        		int j = list.get(leave).iterator().next();
        		list.get(j).remove(leave);
        		if(list.get(j).size() == 1)
        			newLeaves.add(j);
        	}
        	leaves = newLeaves;
        }
        return leaves;
    }
}
