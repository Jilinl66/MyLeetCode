package newToLeetcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//56. Merge Intervals
public class test56 {

	public static void main(String[] args){
		test56 T2 = new test56();
		List<Interval> testL = new ArrayList<Interval>();
		testL.add(T2.new Interval(1,4));
		testL.add(T2.new Interval(0,4));
		T2.print(testL);
		T2.print(T2.merge(testL));
	}
	
	public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> result = new ArrayList<Interval>();
    	if (intervals.isEmpty()){
    		return result;
    	}
        Collections.sort(intervals, new Comparator<Interval>(){
        	@Override
        	public int compare(Interval intra1, Interval intra2){
                return intra1.start - intra2.start;
        	}
        });
      	int j = 0;
    	result.add(new Interval(intervals.get(0).start, intervals.get(0).end));
        for(int i = 1; i<intervals.size(); i++){
        	if (intervals.get(i).start <= result.get(j).end){
        		if (intervals.get(i).end > result.get(j).end)
        			result.get(j).end = intervals.get(i).end;
        	}
        	else{
        		result.add(new Interval(intervals.get(i).start, intervals.get(i).end));
        		j ++;
        		System.out.println(j);
        	}
        } 
        return result;
    }
	
	public void print(List<Interval> intervals){
		for(Interval interval: intervals){
			System.out.println(interval.start + " " + interval.end);
			
		}
	}
	
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
}



