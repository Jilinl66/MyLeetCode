package happy2017;
//11. Container With Most Water
public class test11 {
	int maxArea;
	public int maxArea(int[] height) {
		int n = height.length;
		int i = 0, j = n - 1;
		while(i < j) {
			maxArea = Math.max((j - i) * Math.min(height[i], height[j]), maxArea);
			if(height[i] < height[j]) 
				i ++;
			else
				j--;		
		}
		return maxArea;
	}
}

/**
 * Bloomberg,
 */
