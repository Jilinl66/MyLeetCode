package locked;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//251. Flatten 2D Vector
public class test251 implements Iterator<Integer> {
	private Iterator<List<Integer>> iter1;
	private Iterator<Integer> iter2;
	
    public test251(List<List<Integer>> vec2d) {
    	iter1 = vec2d.iterator();
    }

    @Override
    public Integer next() {
    	return iter2.next();
    }

    @Override
    public boolean hasNext() {
    	while((iter2 == null || !iter2.hasNext()) && iter1.hasNext())
    		iter2 = iter1.next().iterator();
    	return iter2 != null && iter2.hasNext();
    }
}
//public class test251 implements Iterator<Integer> {
//	ArrayList<Integer> list = new ArrayList<>();
//	int curindex;
//    public test251(List<List<Integer>> vec2d) {
//    	curindex = -1;
//    	for(int i = 0; i < vec2d.size(); i++){
//    		for(int j = 0; j < vec2d.get(i).size(); j++){
//    			list.add(vec2d.get(i).get(j));
//    		}
//    	}
//    }
//
//    @Override
//    public Integer next() {
//        return list.get(++curindex);
//    }
//
//    @Override
//    public boolean hasNext() {
//        return curindex + 1 < list.size();
//    }
//}

// Google Airbnb Twitter Zenefits
// The last line, if iter2 == null, iter2.hasNext() will cause error exception