package locked;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//170. Two Sum III - Data structure design
public class test170 {
	HashMap<Integer, Integer> map;
    /** Initialize your data structure here. */
    public test170() {
    	map = new HashMap<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
    	if(map.containsKey(number))
    		map.put(number, 2);
    	else
    		map.put(number, 1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
    	Iterator<Integer> iter = map.keySet().iterator();
    	while(iter.hasNext()){
    		int num1 = iter.next();
    		int num2 = value - num1;
    		if((num1 == num2 && map.get(num1) == 2) || ((num1 != num2) && map.containsKey(num2)))
    			return true;
    	}
    	return false;
    }
}


//public class test170 {
//	Set<Integer> sums;
//	Set<Integer> nums;
//    /** Initialize your data structure here. */
//    public test170() {
//    	sums = new HashSet<>();
//    	nums = new HashSet<>();
//    }
//    
//    /** Add the number to an internal data structure.. */
//    public void add(int number) {
//        if(!nums.isEmpty()){
//        	for(int num: nums)
//        		sums.add(num + number);
//        }
//        nums.add(number);
//    }
//    
//    /** Find if there exists any pair of numbers which sum is equal to the value. */
//    public boolean find(int value) {
//        return sums.contains(value);
//    }
//}
//LinkedIn