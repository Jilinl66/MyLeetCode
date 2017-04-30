package happy2017;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
 
//332. Reconstruct Itinerary
public class test332 {
    public List<String> findItinerary(String[][] tickets) {
    	List<String> route = new LinkedList<>();
    	Map<String, PriorityQueue<String>> map = new HashMap<>();
    	for(String[] ticket: tickets)
    		map.computeIfAbsent(ticket[0], k->new PriorityQueue()).add(ticket[1]);
    	Stack<String> stack = new Stack<>();
    	stack.push("JFK");
    	while(!stack.isEmpty()){
    		while(map.containsKey(stack.peek()) && !map.get(stack.peek()).isEmpty()){
    			stack.push(map.get(stack.peek()).poll());
    		}
    		route.add(0, stack.pop());
    	}
    	return route;
    }
}
