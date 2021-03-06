package locked;

import java.util.Arrays;
import java.util.Comparator;

//252. Meeting Rooms 
public class test252 {
	 public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	 }
	 
    public boolean canAttendMeetings(Interval[] intervals) {
    	Arrays.sort(intervals, new Comparator<Interval>() {
        	@Override
        	public int compare(Interval o1, Interval o2) {      		
        		return o1.start - o2.start;
        	}
		});
    	for (int i = 1; i < intervals.length; i++) {
    		if(intervals[i].start < intervals[i - 1].end)
    			return false;
		}
    	return true;
    }
}

//Facebook