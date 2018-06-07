package happy2017;

import java.util.Comparator;
import java.util.PriorityQueue;

//593. Valid Square
public class test593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		if(o1[0] == o2[0]) return o1[1] - o2[1];
        		return o1[0] - o2[0];
        	}
		});
        queue.offer(p1);
        queue.offer(p2);
        queue.offer(p3);
        queue.offer(p4);
        int[] a1 = queue.poll();
        int[] a2 = queue.poll();
        int[] a3 = queue.poll();
        int[] a4 = queue.poll();
        if(!is90Degree(a1, a2, a3) || !is90Degree(a2, a1, a4) || !is90Degree(a3, a1, a4) || !is90Degree(a4, a2, a3)) return false;
        if(calDis(a1, a2) == 0 || calDis(a1, a3) == 0 || calDis(a1, a2) != calDis(a1, a3)) return false;
        return true;
    }
    
    private double calDis(int[] p1, int[] p2) {
		return Math.sqrt((Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2)));
	}
    
    private boolean is90Degree(int[] p, int[] p1, int[] p2) {
    	int x1 = p1[0] - p[0];
    	int y1 = p1[1] - p[1];
    	int x2 = p2[0] - p[0];
    	int y2 = p2[1] - p[1];
    	return x1 * x2 + y1 * y2 == 0;
    }
}
