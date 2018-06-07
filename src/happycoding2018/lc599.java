package happycoding2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//599. Minimum Index Sum of Two Lists
public class lc599 {
//	public String[] findRestaurant(String[] list1, String[] list2) {
//        int indexCount = -1;
//        List<String> res = new ArrayList<>();
//        for (int i = 0; i < list1.length; i ++) {
//        	for (int j = 0; j < list2.length; j ++) {
//        		if (list1[i].equals(list2[j])) {
//        			int count = i + j;
//        			if (count == indexCount) {
//        				res.add(list1[i]);
//        			} else if (indexCount == -1 || count < indexCount) {
//        				indexCount = count;
//        				res.clear();
//        				res.add(list1[i]);
//        			}
//        		}
//        	}
//        }
//        String[] resArr = new String[res.size()];
//        for (int i = 0; i < res.size(); i ++) {
//        	resArr[i] = res.get(i);
//        }
//        return resArr;
//    }
	
	// Hash table
	public String[] findRestaurant(String[] list1, String[] list2) {
		int indexCount = -1;
		List<String> resList = new ArrayList<>();
		Map<String, Integer> indexMap = new HashMap<>();
		for (int i = 0; i < list1.length; i ++) {
			indexMap.put(list1[i], i);
		}
		for (int i = 0; i < list2.length; i ++) {
			String str = list2[i];
			if (indexMap.containsKey(str)) {
				int indexSum = i + indexMap.get(str);
				if (indexCount == -1 || indexSum < indexCount) {
					indexCount = indexSum;
					resList.clear();
					resList.add(str);
				} else if (indexSum == indexCount) {
					resList.add(str);
				}
			}
		}
		String[] resArr = new String[resList.size()];
      for (int i = 0; i < resList.size(); i ++) {
      	resArr[i] = resList.get(i);
      }
      return resArr;
    }
}
