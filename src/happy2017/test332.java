package happy2017;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
 
//332. Reconstruct Itinerary
public class test332 {
	Map<String, PriorityQueue<String>> map = new HashMap<>();
	List<String> res = new ArrayList<>();
    public List<String> findItinerary(String[][] tickets) {    	
    	for(String[] t: tickets) {
    		map.computeIfAbsent(t[0], k->new PriorityQueue<>()).add(t[1]);
    	}
    	visit("JFK");
    	return res;
    }
    
    private void visit(String airport) {
    	while(map.containsKey(airport) && !map.get(airport).isEmpty())
    		visit(map.get(airport).poll());
    	res.add(0, airport);
    }
}
