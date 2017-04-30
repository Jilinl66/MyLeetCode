package locked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//465. Optimal Account Balancing 
public class test465 {
    public int minTransfers(int[][] transactions) {
        Map<Integer, Integer> degree = new HashMap<>();
        for(int[] transaction: transactions) {
        	int from = transaction[0];
        	int to = transaction[1];
        	int val = transaction[2];
        	if(!degree.containsKey(from)) 
        		degree.put(from, 0);
        	if(!degree.containsKey(to))
        		degree.put(to, 0);
        	degree.put(to, degree.get(to) + val);
        	degree.put(from, degree.get(from) - val);
        }
        List<Integer> delta = new ArrayList<>();
        for(int value: degree.values())
        	if(value != 0)
        		delta.add(value);
        int countMatch = removeMatch(delta);
        int res = countMatch + minTransStartFrom(delta, 0);
        return res;
    }
    
   private int removeMatch(List<Integer> delta) {
	   Collections.sort(delta);
	   int count = 0;
	   int i = 0, j = delta.size() - 1;
	   while(i < j) {
		   if(delta.get(i) + delta.get(j) == 0) {
			   delta.remove(j);
			   delta.remove(i);
			   count++;
			   j -= 2;
		   }
		   else if(delta.get(i) + delta.get(j) < 0)
			   i ++;
		   else
			   j--;
	   }
	   return count;
   }
   
   private int minTransStartFrom(List<Integer> delta, int start) {
	   int ret = Integer.MAX_VALUE;
	   int n = delta.size(); 
	   while(start < n && delta.get(start) == 0)
		   start++;
	   if(start == n) return 0;
	   for(int i = start + 1; i < n; i++) {
		   if(delta.get(start) * delta.get(i) < 0) {
			   delta.set(i, delta.get(start) + delta.get(i));
			   ret = Math.min(ret, minTransStartFrom(delta, start + 1) + 1);
			   delta.set(i, delta.get(i) - delta.get(start));
		   }
	   }
	   return ret;
   }
}