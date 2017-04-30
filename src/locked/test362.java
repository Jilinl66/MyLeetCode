package locked;

import java.util.Deque;
import java.util.LinkedList;

//362. Design Hit Counter
public class test362 {
	Deque<int[]> queue;
	int sum;
	
    /** Initialize your data structure here. */
    public test362() {
    	queue = new LinkedList<>();
    	sum = 0;
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
		if(!queue.isEmpty() && queue.getLast()[0] == timestamp) {
			 int[] last = queue.removeLast();
			 last[1] ++;
			 queue.addLast(last);
		 }
		 else {
			 queue.addLast(new int[]{timestamp, 1});
		 }
		sum ++;
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
    	while(!queue.isEmpty() && timestamp - queue.getFirst()[0] >= 300) {
    		sum -= queue.pollFirst()[1];
    	}
    	return sum;
    }
}

//Dropbox Google