package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//399. Evaluate Division
// Good dfs example!
public class test399 {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        Map<String, ArrayList<String>> pairs = new HashMap<>();
        Map<String, ArrayList<Double>> valuesPairs = new HashMap<>();
        for(int i = 0; i < equations.length; i++){
        	String[] equ = equations[i];
        	if(!pairs.containsKey(equ[0])){
        		pairs.put(equ[0], new ArrayList<String>());
        		valuesPairs.put(equ[0], new ArrayList<Double>());
        	}
        	pairs.get(equ[0]).add(equ[1]);
        	valuesPairs.get(equ[0]).add(values[i]);
        	if(!pairs.containsKey(equ[1])){
        		pairs.put(equ[1], new ArrayList<String>());
        		valuesPairs.put(equ[1], new ArrayList<Double>());
        	}
        	pairs.get(equ[1]).add(equ[0]);
        	valuesPairs.get(equ[1]).add(1/values[i]);
        }
        double[] res = new double[queries.length];
        for(int i = 0; i < queries.length; i++){
        	String[] q = queries[i];
        	res[i] = dfs(q[0], q[1], pairs, valuesPairs, new HashSet<String>(), 1.0) ;
        	res[i] = (res[i] == 0.0? -1.0: res[i]);
        }
        return res;
    }
    
    private double dfs(String start, String end, Map<String, ArrayList<String>> pairs, 
    		Map<String, ArrayList<Double>> valuesPairs, HashSet<String> set, double val) {
		if(set.contains(start) || !pairs.containsKey(start)) return 0.0;
		if(start.equals(end)) return val;
		set.add(start);
		ArrayList<String> strList = pairs.get(start);
		ArrayList<Double> valueList = valuesPairs.get(start);
		double ret = 0.0;
		for(int i = 0; i < strList.size(); i++){
			ret = dfs(strList.get(i), end, pairs, valuesPairs, set, val * valueList.get(i));
			if(ret != 0)
				break;
		}
		set.remove(start);
		return ret; 
	}
}
