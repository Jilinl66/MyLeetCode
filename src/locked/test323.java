package locked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

//323. Number of Connected Components in an Undirected Graph
public class test323 {
	public int countComponents(int n, int[][] edges) {
		int[] roots = new int[n];
		for(int i = 0; i < n; i++)
			roots[i] = i;
		for(int[] edge: edges) {
			int root1 = findRoot(roots, edge[0]);
			int root2 = findRoot(roots, edge[1]);
			if(root1 != root2) {
				roots[root1] = root2;
				n--;
			}
		}
		return n;
	}
	
	private int findRoot(int[] roots, int n) {
		while(roots[n] != n) {
			roots[n] = roots[roots[n]];
			n = roots[n];
		}
		return n;
	}
	
//Slow solution
//    public int countComponents(int n, int[][] edges) {
//    	Map<Integer, ArrayList<Integer>> map = new HashMap<>();
//    	int res = 0;
//        boolean[] visited = new boolean[n];
//        int nodeCount = 0;
//        for(int[] edge: edges) { 
//        	if(!map.containsKey(edge[0]))
//        		map.put(edge[0], new ArrayList<>());
//        	map.get(edge[0]).add(edge[1]);
//        	if(!map.containsKey(edge[1]))
//        		map.put(edge[1], new ArrayList<>());
//        	map.get(edge[1]).add(edge[0]);
//        }
//        while(nodeCount < n) {
//        	for(int i = 0; i < n; i++) {
//        		if(visited[i]) continue;
//        		Queue<Integer> queue = new LinkedList<>();
//        		queue.offer(i);
//        		while(!queue.isEmpty()) {
//        			int cur = queue.poll();
//            		visited[cur] = true;
//            		nodeCount++;
//            		if(map.containsKey(cur)) {
//	        			ArrayList<Integer> list = map.get(cur);
//	        			for(int node: list) {
//	        				if(!visited[node]) {
//	        					queue.offer(node);
//	        				}
//	        			}
//            		}
//        		}
//        		res++;
//        	}
//        }
//        return res;
//    }
}

//Isolcate point, not in the map 
//Union find