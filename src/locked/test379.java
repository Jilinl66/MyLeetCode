package locked;

import java.util.HashSet;
import java.util.Set;

//379. Design Phone Directory

public class test379 {
	int[] arr;
    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public test379(int maxNumbers) {
        arr = new int[maxNumbers];
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == 0) {
        		arr[i] = 1;
        		return i;
        	}
        }
        return -1;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        return arr[number] == 0;
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        arr[number] = 0;
    }
}
//public class test379 {
//	Set<Integer> used;
//	Set<Integer> unused;
//	 
//    /** Initialize your data structure here
//        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
//    public test379(int maxNumbers) {
//    	used = new HashSet<>();
//    	unused = new HashSet<>();
//    	for(int i = 0; i < maxNumbers; i++) {
//    		unused.add(i);
//    	}
//    }
//     
//    /** Provide a number which is not assigned to anyone.
//        @return - Return an available number. Return -1 if none is available. */
//    public int get() {
//    	if(unused.size() == 0) return -1;
//        int number = unused.iterator().next();
//        unused.remove(number);
//        used.add(number);
//        return number;
//    }
//    
//    /** Check if a number is available or not. */
//    public boolean check(int number) {
//        return unused.contains(number);
//    }
//    
//    /** Recycle or release a number. */
//    public void release(int number) {
//        unused.add(number);
//        used.remove(number);
//    }
//}

