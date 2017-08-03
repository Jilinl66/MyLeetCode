package locked;

import java.util.List;

//469. Convex Polygon
public class test469 {
    public boolean isConvex(List<List<Integer>> points) {
    	int n = points.size();
    	boolean neg = false;
    	boolean pos = false;
        for(int i = 0; i < n; i++) {
        	int cP = crossProduct(points.get(i).get(0), points.get(i).get(1), 
        			points.get((i + 1) % n).get(0), points.get((i + 1) % n).get(1), 
        			points.get((i + 2) % n).get(0), points.get((i + 2) % n).get(1));
        	if(cP > 0) {
        		 pos = true; //zero no change
        	}
        	else if(cP < 0) {
        		neg = true;
        	}
        	if(pos && neg)
        		return false;
        }	
        return true;
    }
    
    private int crossProduct(int Ax, int Ay, int Bx, int By, int Cx, int Cy) {
		int BAx = Ax - Bx;
		int BAy = Ay - By;
		int BCx = Cx - Bx;
		int BCy = Cy - By;
		return BAx * BCy - BAy * BCx;
	}
 }
