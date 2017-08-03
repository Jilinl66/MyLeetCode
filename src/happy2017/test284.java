package happy2017;

import java.util.Iterator;

//284. Peeking Iterator
public class test284 {
	class PeekingIterator implements Iterator<Integer> {
		boolean hasPeeked = false;
		int topEle =  0;
		Iterator<Integer> iterator;
		public PeekingIterator(Iterator<Integer> iterator) {
		    this.iterator = iterator; 
		}

	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
	        if(!hasPeeked){
	        	topEle = iterator.next();
	        	hasPeeked = true;
	        }
	        return topEle;
		}

		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
		    if(hasPeeked){
		    	hasPeeked = false;
		    	return topEle;
		    }
		    else
		    	return iterator.next();
		}

		@Override
		public boolean hasNext() {
		    if (iterator.hasNext() || hasPeeked) 
				return true;
		    return false;
		}
	}
}
