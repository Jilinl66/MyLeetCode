package happy2017;

//210. Course Schedule II 
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class test210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    	int[] res = new int[numCourses];
    	int idx = 0;
    	Map<Integer, List<Integer>> map = new HashMap<>();
    	Queue<Integer> queue = new LinkedList<>();
    	int[] count = new int[numCourses];
    	for(int i = 0; i < numCourses; i++)
    		map.put(i, new ArrayList<>());
    	for(int[] edge: prerequisites) {
    		map.get(edge[1]).add(edge[0]);
    		count[edge[0]]++;
    	}
    	for(int i = 0; i < numCourses; i++)
    		if(count[i] == 0)
    			queue.offer(i);
    	while(!queue.isEmpty()) {
    		int course = queue.poll();
    		res[idx++] = course;
    		for(int c: map.get(course)) {
    			if(--count[c] == 0)
    				queue.offer(c);
    		}
    	}
    	return idx < numCourses? new int[]{}: res;
    }
}
