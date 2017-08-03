package locked;

import java.util.HashMap;

//359. Logger Rate Limiter
public class test359 {
	HashMap<String, Integer> map;
	
    /** Initialize your data structure here. */
    public test359() {
    	map = new HashMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message) || timestamp - map.get(message) >= 10) {
        	map.put(message, timestamp);
        	return true;
        }
        return false;
    }
}
