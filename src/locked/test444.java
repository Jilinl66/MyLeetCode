package locked;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//444. Sequence Reconstruction
public class test444 {
    public boolean sequenceReconstruction(int[] org, List<List<Integer>> seqs) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Map<Integer, Integer> indegree = new HashMap<>();
        for(List<Integer> list: seqs) {
        	if(list.size() == 1) {
        		if(!map.containsKey(list.get(0))) {
        			map.put(list.get(0), new HashSet<>());
        			indegree.put(list.get(0), 0);
        		}
        	}
        	else {
        		for(int i = 0; i < list.size() - 1; i++) {
        			if(!map.containsKey(list.get(i))) {
        				map.put(list.get(i), new HashSet<>());
        				indegree.put(list.get(i), 0);
        			}
        			if(!map.containsKey(list.get(i + 1))) {
        				map.put(list.get(i + 1), new HashSet<>());
        				indegree.put(list.get(i + 1), 0);
        			}
        			if(map.get(list.get(i)).add(list.get(i + 1))) {
        				indegree.put(list.get(i + 1), indegree.get(list.get(i + 1)) + 1);
        			}
        		}
        	}
        }
    	Queue<Integer> queue = new LinkedList<>();
    	for(Map.Entry<Integer, Integer> entry: indegree.entrySet())
    		if(entry.getValue() == 0)
    			queue.offer(entry.getKey());
    	int index = 0;
    	while(!queue.isEmpty()) {
    		int size = queue.size();
    		if(size > 1) return false;
    		int cur = queue.poll();
    		if(index == org.length || org[index++] != cur) return false;
    		for(int i: map.get(cur)) {
    			indegree.put(i, indegree.get(i) - 1);
    			if(indegree.get(i) == 0)
    				queue.offer(i);
    		}
    	}
    	return index == map.size() && index == org.length;
     }
}

//Graph Topological Sort
