package locked;

//277. Find the Celebrity
public class test277 {
    public int findCelebrity(int n) {
    	int candidate = 0;
    	for (int i = 0; i < n; i++) {
			if(knows(candidate, i))
				candidate = i;
		}
    	for(int i = 0; i < n; i++) {
    		if(candidate != i && (knows(candidate, i) || !knows(i, candidate)))
    			return -1;
    	}
    	return candidate;
    }

	private boolean knows(int i, int j) {
		return false;
	}
}

// LinkedIn Facebook