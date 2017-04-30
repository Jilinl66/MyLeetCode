package happy2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

//436. Find Right Interval
public class test436 {
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	
	public int[] findRightInterval(Interval[] intervals) {
		int[] res = new int[intervals.length];
		NavigableMap<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < intervals.length; i++){
			if(!map.containsKey(intervals[i].start))
				map.put(intervals[i].start, i);
		}
		for(int i = 0; i < intervals.length; i++){
			Map.Entry<Integer, Integer> entry = map.ceilingEntry(intervals[i].end);
			res[i] = entry == null? -1: entry.getValue();
		}
		return res;
	}
	
//    public int[] findRightInterval(Interval[] intervals) {
//    	int len = intervals.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        List<Integer> starts = new ArrayList<>();
//        int[] res = new int[len];
//        for(int i = 0; i < len; i++){
//        	int start = intervals[i].start;
//        	if(!map.containsKey(start)){
//        		map.put(start, i);
//        		starts.add(start);
//        	}
//        }
//        Collections.sort(starts);
//        for(int i = 0; i < intervals.length; i++){
//        	int end = intervals[i].end;
//        	int index = BSearch(starts, end);
//        	if(starts.get(index) < end)
//        		res[i] = -1;
//        	else
//        		res[i] = map.get(starts.get(index));
//        }            
//        return res;
//    }
//    
//    public int BSearch(List<Integer> list, int i){
//    	int low = 0, high = list.size() - 1;
//    	while(low < high){
//    		int mid = (low + high)/2;
//    		if(list.get(mid) == i)
//    			return mid;
//    		else if(list.get(mid) < i)
//    			low = mid + 1;
//    		else
//    			high = mid; // high is not mid - 1
//    	}
//    	return low;
//    }
}
