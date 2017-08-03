package locked;

import java.util.LinkedList;
import java.util.Queue;

//346. Moving Average from Data Stream
public class test346 {
	Queue<Integer> queue;
	int cap;
	double sum; 
	
    /** Initialize your data structure here. */
    public test346(int size) {
    	queue = new LinkedList<>(); 
    	cap = size;
    }
    
    public double next(int val) {
    	sum += val;
    	queue.offer(val);
        if(queue.size() <= cap) {
        	 return sum/queue.size();
        }
        sum -= queue.poll();
        return sum/cap;
    }
}
