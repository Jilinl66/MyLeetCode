package happy2017;

import java.util.Arrays;

//475. Heaters
public class test475 {
    public int findRadius(int[] houses, int[] heaters) {
    	Arrays.sort(heaters);
        int minRange = Integer.MIN_VALUE;
        for(int house: houses){
        	int index = Arrays.binarySearch(heaters, house);
        	if(index < 0)
        		index = -(index + 1);
        	int dis1 = index >= 1? house - heaters[index - 1]: Integer.MAX_VALUE;
        	int dis2 = index < heaters.length? heaters[index] - house: Integer.MAX_VALUE;
        	minRange = Math.max(minRange, Math.min(dis1, dis2));
        }
        return minRange;
    }
}
