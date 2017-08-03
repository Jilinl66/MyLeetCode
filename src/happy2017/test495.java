package happy2017;
//495. Teemo Attacking
public class test495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    	int totalDuration = 0;
    	int i = 0;
    	int end = 0;
        while(i < timeSeries.length){
        	if(i == timeSeries.length - 1) {
        		totalDuration += duration;
        		return totalDuration;
        	}
        	end = timeSeries[i] + duration;
        	i++;
        	if(i < timeSeries.length && timeSeries[i] >= end)
        		totalDuration += duration;
        	else {
        		while(i< timeSeries.length && timeSeries[i] < end){
        			totalDuration += timeSeries[i] - timeSeries[i - 1];
        			end = timeSeries[i] + duration;
        			i++;
        		}
        		totalDuration += duration;
			}
        }
        return totalDuration;
    }
}
