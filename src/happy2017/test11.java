package happy2017;
//11. Container With Most Water
public class test11 {
	//brute force searching
//    public int maxArea(int[] height) {
//    	int max = Integer.MIN_VALUE;
//        for(int i = 0; i < height.length; i++){
//        	for(int j = i + 1; j < height.length; j++){
//        		max = Math.max(max, (j - i)* Math.min(height[i], height[j]));
//        	}
//        }
//        return max;
//    }
	public int maxArea(int[] height) {
		int start = 0, end = height.length - 1, max =Integer.MIN_VALUE;
		while(start < end){
			max = Math.max(max, (end - start) * Math.min(height[start],height[end]));
			if(height[start] < height[end])
				start ++;
			else
				end --;
		}
		return max;
	}
}
