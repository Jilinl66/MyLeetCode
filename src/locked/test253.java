package locked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import locked.test252.Interval;

//253. Meeting Rooms II
public class test253 {
    public int minMeetingRooms(Interval[] intervals) {
    	int count = 0;
    	PriorityQueue<Integer> queue = new PriorityQueue<>();
        Arrays.sort(intervals, new Comparator<Interval>() {
        	@Override
        	public int compare(Interval o1, Interval o2) {
        		return o1.start - o2.start;
        	}
		});
        for (int i = 0; i < intervals.length; i++) {
			while(!queue.isEmpty() && queue.peek() <= intervals[i].start)
				queue.poll();
			count = Math.max(count, queue.size() + 1);
			queue.offer(intervals[i].end);
		}
        return count;
    }
}

// Google Snapchat Facebook