package happy2017;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//554. Brick Wall
// Be clear of the loop element, the last do not count
public class test554 {
    public int leastBricks(List<List<Integer>> wall) {
    	if(wall.size() == 0) return 0;
    	Map<Integer, Integer> map = new HashMap<>();
    	for(int i = 0; i < wall.size(); i++){
    		for(int j = 0; j < wall.get(i).size() - 1; j++){
    			List<Integer> row = wall.get(i);
    			if(j > 0)
    				row.set(j, row.get(j - 1) + row.get(j));
    			map.put(row.get(j), map.getOrDefault(row.get(j), 0) + 1);
    		}
    	}
    	int max = 0;
    	for(int val: map.values())
    		max = Math.max(max, val);
    	return wall.size() - max;
    }
} 
