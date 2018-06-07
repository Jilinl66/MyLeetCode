package happy2017;

import java.util.HashMap;

//149. Max Points on a Line 
public class test149 {
	class Point {
		int x;
		int y;
		Point() { x = 0; y = 0; }
		Point(int a, int b) { x = a; y = b; }
	}
	
    public int maxPoints(Point[] points) {
    	if(points == null || points.length <= 2) return points.length;
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < points.length - 1; i++) {
        	map.clear(); // clean map every iteration
        	int overlap = 0;
        	int max = 0;
        	for(int j = i + 1; j < points.length; j++) {
        		int deltaX = points[i].x - points[j].x;
        		int deltaY = points[i].y - points[j].y;
        		if(deltaX == 0 && deltaY == 0) {
        			overlap ++;
        			continue;
        		}
        		int gcd = GCD(deltaX, deltaY);
        		if(gcd != 0) {
	        		deltaX /= gcd;
	        		deltaY /= gcd;
        		}
	        	if(map.containsKey(deltaX)) {      			
        			map.get(deltaX).put(deltaY, map.get(deltaX).getOrDefault(deltaY, 0) + 1);
        		}
        		else {
        			map.put(deltaX, new HashMap<>());
        			map.get(deltaX).put(deltaY, 1);
        		}
        		max = Math.max(max, map.get(deltaX).get(deltaY));
        	}
        	res = Math.max(res, max + overlap + 1);
        }
        return res;    	
    }
    
    private int GCD(int a, int b) {
    	if(b == 0) return a;
    	else return GCD(b, a%b);
    }
}

/** LinkedIn Apple Twitter
 */
