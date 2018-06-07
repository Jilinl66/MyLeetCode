package happy2017;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//56. Merge Intervals
public class test56 {
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
    public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> res = new ArrayList<>();
        PriorityQueue<Interval> queue = new PriorityQueue<>(new Comparator<Interval>() {
        	@Override
        	public int compare(Interval o1, Interval o2) {
        		return o1.start - o2.start;
        	}
		});
        for(Interval interval: intervals)
        	queue.offer(interval);
        while(!queue.isEmpty()) {
        	Interval interval = queue.poll();
        	while(!queue.isEmpty() && queue.peek().start <= interval.end) {
        		 interval.end = Math.max(interval.end, queue.poll().end);
        	}
        	res.add(interval);
        }
        return res;
    }
}

/**  LinkedIn Google Facebook Twitter Microsoft Bloomberg Yelp
 * 
 */
