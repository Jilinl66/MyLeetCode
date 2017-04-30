package happy2017;

import java.util.Arrays;
import java.util.Comparator;

//452. Minimum Number of Arrows to Burst Balloon
public class test452 {
    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length == 0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
        	public int compare(int[] o1, int[] o2) {
        		if(o1[0] == o2[0]) 
        			return o1[1] - o2[1];
        		else 
        			return o1[0] - o2[0];
			}
		});
        int minArrow = 1;
        int headLine = points[0][1];
        for(int i = 1; i < points.length; i++){
        	int[] balloon = points[i];
        	if(balloon[0] <= headLine)
        		headLine = Math.min(headLine, balloon[1]);
        	else{
        		minArrow++;
        		headLine = balloon[1];
        	}
        }
        return minArrow;
    }
}