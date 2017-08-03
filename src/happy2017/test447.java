package happy2017;

import java.util.HashMap;
import java.util.Map;

//447. Number of Boomerangs
public class test447 {
    public int numberOfBoomerangs(int[][] points) {
    	Map<Integer, Integer> map = new HashMap<>();
    	int res = 0;
        for(int i = 0; i < points.length; i++){
        	for(int j = 0; j < points.length; j++){
        		if(i == j) continue;
        		int d = computeDis(points[i], points[j]);
        		map.put(d, map.getOrDefault(d, 0) + 1);
        	}
	        for(int val: map.values())
	        	res += val * (val - 1);
	        map.clear();
        }
        return res;
    }
    
    private int computeDis(int[] p1, int[] p2) {
		return (int) (Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
	}
}
