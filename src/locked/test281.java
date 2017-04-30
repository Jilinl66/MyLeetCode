package locked;

import java.util.Iterator;
import java.util.List;

//281. Zigzag Iterator
public class test281 {
	Iterator<Integer> iter1;
	Iterator<Integer> iter2;
	Iterator<Integer>[] arr;
	int next;
    public test281(List<Integer> v1, List<Integer> v2) {
        iter1 = v1.iterator();
        iter2 = v2.iterator();
        arr = new Iterator[]{iter1, iter2};
        next = 0;
    }

    public int next() {
    	hasNext();
    	return arr[next++].next();   
    }

    public boolean hasNext() {
    	int i = 0;
    	while(i++ < arr.length){
    		next %= arr.length;
    		if(arr[next].hasNext())
    			return true;
    		else
    			next = (next + 1) % arr.length;
    	}
    	return false;
    }
}

//index over boundary problem, line21