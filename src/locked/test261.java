package locked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

//261. Graph Valid Tree
public class test261 {
    public boolean validTree(int n, int[][] edges) {
    	if(edges.length == 0) {
    		if(n == 0) return true;
    		else return false;
    	}
    	if(edges.length != n - 1) return false;
        boolean[] visited = new boolean[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int[] edge: edges) {
        	if(!map.containsKey(edge[0])) {
        		List<Integer> newList = new ArrayList<>();
        		map.put(edge[0], newList);
        	}
        	map.get(edge[0]).add(edge[1]);
        	if(!map.containsKey(edge[1])) {
        		List<Integer> newList = new ArrayList<>();
        		map.put(edge[1], newList);
        	}
        	map.get(edge[1]).add(edge[0]);
        }
        for(int i: map.get(edges[0][0]))
        	queue.offer(i);
        visited[edges[0][0]] = true;
        int countPoint = 1;
        while(!queue.isEmpty()) {
        	int top = queue.poll();
        	if(!visited[top]) {
        		for(int i: map.get(top)) {
        			if(!visited[i])
        				queue.offer(i);
        		}
        		visited[top] = true;
        		countPoint++;
        	}
        }
        return countPoint == n;
    }
}

//Google Facebook Zenefits
//Consider separate point(s) 