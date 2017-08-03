package happy2017;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//350. Intersection of Two Arrays II
public class test350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for(int num: nums1)
        	map.put(num, map.getOrDefault(num, 0) + 1);
	    for(int num: nums2)
	    	if(map.containsKey(num) && map.get(num) > 0){
	    		list.add(num);
	    		map.replace(num, map.get(num) - 1);
	    	}
	    
	    int[] res = new int[list.size()];
	    for(int i = 0; i < list.size(); i++)
	    	res[i] = list.get(i);
	    return res;
	}
}
