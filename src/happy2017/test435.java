package happy2017;

import java.util.Arrays;
import java.util.Comparator;

//435. Non-overlapping Intervals
public class test435 {
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>() {
        	public int compare(Interval o1, Interval o2){
        		return o1.end - o2.end;
        	}
		});
        int end = intervals[0].end;
        int count = 1;
        for(int i = 0; i < intervals.length; i++){
        	if(intervals[i].start >= end){
        		end = intervals[i].end;
        		count ++;
        	}
        }
        return intervals.length - count;
    }
}