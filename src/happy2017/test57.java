package happy2017;

import java.util.ArrayList;
import java.util.List;

//57. Insert Interval
public class test57 {
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<>(intervals);
    	if(intervals.isEmpty()){
    		res.add(newInterval);
    		return res;
    	}	 
        int len = intervals.size();
        int start = newInterval.start, end = newInterval.end;
        int i = 0;
        while(i < len && newInterval.start < intervals.get(i).start && !isOverlapping(intervals.get(i), newInterval)){
        	res.add(intervals.get(i));
        	i++;
        }
        i--;
        while(i < len && isOverlapping(intervals.get(i), newInterval)){		
        	start = Math.min(start, intervals.get(i).start);
    		end = Math.max(end, intervals.get(i).end);
    		i++;
        }
        res.add(new Interval(start, end));
        while(i < len)
        	res.add(intervals.get(i));
        return res;
    }
    
    public boolean isOverlapping(Interval i1, Interval i2) {
		if(i1.end < i2.start || i2.end < i1.start)
			return false;
		else
			return true;
	}
}
