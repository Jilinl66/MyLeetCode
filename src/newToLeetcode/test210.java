package newToLeetcode;
//210. Course Schedule II 
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class test210 {
	 public int[] findOrder(int numCourses, int[][] prerequisites) {
		 int[] preEdgeCount = new int[numCourses];
		 List<List<Integer>> adjs = new ArrayList<>(numCourses);
		 InitializeGraph(preEdgeCount, adjs, prerequisites);
		 return solveByBFS(preEdgeCount, adjs);
	 }


	private void InitializeGraph(int[] preEdgeCount, List<List<Integer>> adjs, int[][] prerequisites) {
		int len = preEdgeCount.length;
		while(len > 0){
			adjs.add(new ArrayList<>());
			len --;
		}
		for (int[] edge :prerequisites){
			preEdgeCount[edge[0]]++;
			adjs.get(edge[1]).add(edge[0]);
		}
	}
	
	private int[] solveByBFS(int[] preEdgeCount, List<List<Integer>> adjs) {
		int[] resOrder = new int[preEdgeCount.length];
		Queue<Integer> toVisit = new ArrayDeque<>();
		for (int i = 0; i < preEdgeCount.length; i++){
			if (preEdgeCount[i] == 0){
				toVisit.offer(i);
			}
		}
		
		int visited = 0;
		while(!toVisit.isEmpty()){
			int from = toVisit.poll();
			resOrder[visited] = from;
			visited ++;
			for (int to :adjs.get(from)){
				preEdgeCount[to]--;
				if (preEdgeCount[to] == 0){
					toVisit.offer(to);
				}
			}
		}
		return visited == preEdgeCount.length? resOrder: new int[0];
	}
}
