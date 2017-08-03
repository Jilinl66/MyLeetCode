package happy2017;

import java.util.ArrayList;
import java.util.List;

//401. Binary Watch
public class test401 {
	/*
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<String>();
        for(int h = 0; h < 12; h++){
        	for(int m = 0; m < 60; m++){
        		if(Integer.bitCount(h * 64 + m) == num)
        			res.add(String.format("%d:%02d", h, m));
        	}
        }
        return res;
    }*/
	
    public List<String> readBinaryWatch(int num) {
    	List<String> res = new ArrayList<String>();
    	int[] hArray = {8 ,4, 2, 1};
    	int[] mArray = {32, 16, 8, 4, 2, 1};
    	for(int c1 = 0; c1 <= num; c1++){
    		int c2 = num - c1;
    		List<Integer> hList = generateDigit(hArray, c1);
    		List<Integer> mList = generateDigit(mArray, c2);
    		for(int h: hList){
    			for(int m: mList){
    				if(h < 12 && m < 60)
    					res.add(String.format("%d:%02d", h, m));
    			}
    		}
    	}
    	return res;
    }
    
    public List<Integer> generateDigit(int[] nums, int count) {
		List<Integer> res = new ArrayList<Integer>();
		helper(nums, count, 0, 0, res);
		return res;
	}
    
    public void helper(int[] nums, int count , int pos, int sum, List<Integer> res) {
		if(count == 0){
			res.add(sum);
			return;
		}
		for(int i = pos; i < nums.length; i++)
			helper(nums, count - 1, i + 1, sum + nums[i], res);
	}
}
