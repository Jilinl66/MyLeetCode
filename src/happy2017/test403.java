package happy2017;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//403. Frog Jump
//Important
public class test403 {
    public boolean canCross(int[] stones) {
        if(stones.length == 0) return true;
        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        map.put(0, new HashSet<Integer>());
        map.get(0).add(1);
        for(int i = 1; i < stones.length; i++)
        	map.put(stones[i],new HashSet<>());
        for(int i =  0;  i < stones.length - 1; i++){
        	int stone = stones[i];
        	for(int step: map.get(stone)){
        		int nextReach = stone + step;
        		if(nextReach == stones[stones.length - 1])
        			return true;
        		HashSet<Integer> set = map.get(nextReach);
        		if(set != null){
        			set.add(step);
        			if(step > 1)
        				set.add(step - 1);
        			set.add(step + 1);
        		}
        	}
        }
        return false;
    }
}
