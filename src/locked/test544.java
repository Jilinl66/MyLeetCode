package locked;

import java.util.ArrayList;
import java.util.List;

//544. Output Contest Matches 
public class test544 {
    public String findContestMatch(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
        	list.add(String.valueOf(i));
		}
        list = helper(list);
        return list.get(0);
    }    
    
    private List<String> helper(List<String> list) {
    	if(list.size() == 1) return list;
    	List<String> newList = new ArrayList<>();
    	int i  = 0, j = list.size() - 1;
    	while(i < j)
    		newList.add("(" + list.get(i ++) + "," + list.get(j --) + ")");
    	List<String> l = helper(newList);
    	return l;
    }
}