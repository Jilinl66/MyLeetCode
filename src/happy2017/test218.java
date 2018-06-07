package happy2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//218. The Skyline Problem
public class test218 {
     public List<int[]> getSkyline(int[][] buildings) {
    	List<int[]> res = new ArrayList<>();
    	List<int[]> criticalPoints = new ArrayList<>();
    	for(int[] b: buildings) {
    		criticalPoints.add(new int[]{b[0], -b[2]});     
    		criticalPoints.add(new int[]{b[1], b[2]});
    	}
    	Collections.sort(criticalPoints, new Comparator<int[]>() {
    		@Override
    		public int compare(int[] o1, int[] o2) {
    			if(o1[0] != o2[0])
    				return o1[0] - o2[0];
    			return o1[1] -o2[1];  //left is ahead of right
    		}
		});
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> (b - a));
        queue.offer(0);
        int prev = 0;
        for(int[] point: criticalPoints) {
        	if(point[1] < 0) {
        		queue.offer(-point[1]); 
        	}
        	else {
        		queue.remove(point[1]);
        	} 
        	int curr = queue.peek();
        	if(prev != curr) {
        		res.add(new int[]{point[0], curr});
        		prev = curr;
        	} 
        }
        return res;
    }
}
