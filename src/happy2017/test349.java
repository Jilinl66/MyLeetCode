package happy2017;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//349. Intersection of Two Arrays 交集 
public class test349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        for(int ele: nums1)
        	set.add(ele);
        for(int ele: nums2)
        	if(set.contains(ele))
        		intersect.add(ele);
        int[] res = new int[intersect.size()];
        Iterator<Integer> iter = intersect.iterator();
        for(int i = 0; i < intersect.size(); i++){
        	res[i] = iter.next();
        }
        return res;
    }
}
