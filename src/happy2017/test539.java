package happy2017;

import java.util.List;

//539. Minimum Time Difference
public class test539 {
	public int findMinDifference(List<String> timePoints) {
		boolean[] mark = new boolean[60 * 24];
		for(String tp: timePoints){
			String[] t = tp.split(":");
			int h = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[1]);
			if(mark[60 * h + m]) return 0;
			mark[60 * h + m] = true;
		}
		int prev = 0, min = Integer.MAX_VALUE;
		int first = Integer.MAX_VALUE, last = Integer.MIN_VALUE;
		for(int i = 0; i < 60 * 24; i++){
			if(mark[i]){
				if(first == Integer.MAX_VALUE){
					first = i;
				}
				else{
					min = Math.min(min, i - prev);
					last = i;
				}
				prev = i;
			}
		}
		return Math.min(min, 60 * 24 - last + first);
	}
	
//    public int findMinDifference(List<String> timePoints) {
//        int totalMin = 24 * 60;
//        int minDiff = Integer.MAX_VALUE;
//        int[] mins = new int[timePoints.size()];
//        for(int i = 0; i < timePoints.size(); i++)
//        	mins[i] = getMin(timePoints.get(i));
//        for(int i = 0; i < timePoints.size(); i++)
//        	for(int j = i + 1; j < timePoints.size(); j ++)
//        		minDiff = Math.min(minDiff, Math.min(Math.abs(mins[i] - mins[j]), totalMin - Math.abs(mins[i] - mins[j])));
//        return minDiff;
//    }
//    
//    private int getMin(String t){
//    	String[] arr = t.split(":");
//    	return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
//    }
}
