package happy2017;

import java.util.HashSet;

//391. Perfect Rectangle
public class test391 {
    public boolean isRectangleCover(int[][] rectangles) {
        if(rectangles.length == 0) return false;
        int xl = Integer.MAX_VALUE;
        int xr = Integer.MIN_VALUE;
        int yb = Integer.MAX_VALUE;
        int yt = Integer.MIN_VALUE;
        HashSet<String> set = new HashSet<>();
        int area = 0;
        for(int[] rec: rectangles){
        	xl = Math.min(xl, rec[0]);
        	xr = Math.max(xr, rec[2]);
        	yb = Math.min(yb, rec[1]);
        	yt = Math.max(yt, rec[3]);
        	area += (rec[3] - rec[1]) * (rec[2] - rec[0]);
//        	int[] p1 = new int[]{rec[0], rec[1]};
//        	int[] p2 = new int[]{rec[0], rec[3]};
//        	int[] p3 = new int[]{rec[2], rec[1]};
//        	int[] p4 = new int[]{rec[2], rec[3]};
        	String s1 = rec[0] + " " + rec[1];
        	String s2 = rec[0] + " " + rec[3];
        	String s3 = rec[2] + " " + rec[1];
        	String s4 = rec[2] + " " + rec[3];

        	if(!set.add(s1)) set.remove(s1);
        	if(!set.add(s2)) set.remove(s2);
        	if(!set.add(s3)) set.remove(s3);
        	if(!set.add(s4)) set.remove(s4);
        	for(String s: set)
        		System.out.println(s);
        }
        if(set.size() == 4 && set.contains(xl + " " + yt) && set.contains(xl + " " + yb) && set.contains(xr + " " + yt) &&
        		set.contains(xr + " " + yb) && area == (xr - xl) * (yt - yb))
        	return true;
        return false;
    }
}
