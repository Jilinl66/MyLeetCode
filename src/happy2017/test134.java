package happy2017;
//134. Gas Station
public class test134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int need = 0, start = 0, total = 0;
        for(int i = 0; i < gas.length; i++){
        	need = need + gas[i] - cost[i];
        	if(need < 0){
        		start = i + 1;
        		total += need;
        		need = 0;
        	}
        }
        return total + need < 0? -1: start;
    }
}
