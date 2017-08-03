package happy2017;

import java.util.HashMap;

//464. Can I Win
public class test464 {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    	if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        return canIWin(maxChoosableInteger, desiredTotal, 0, new HashMap<Integer, Boolean>());
    }

	private boolean canIWin(int maxCInt, int total, int state, HashMap<Integer, Boolean> map) {
		if(map.containsKey(state)) return map.get(state);
		for(int i = 0; i < maxCInt; i++){
			if((state&(1 << i)) == 0){
				if(total <= i + 1 || !canIWin(maxCInt, total - (i + 1), state|(1 << i), map)){
					map.put(state, true);
					return true;
				}
			}			
		}
		map.put(state, false);
		return false;
	}
}
