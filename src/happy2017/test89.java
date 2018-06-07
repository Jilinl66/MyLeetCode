package happy2017;

//89. Gray Code
import java.util.ArrayList;
import java.util.List;

public class test89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for(int i = 0; i < n; i++) {
        	int size = res.size();
        	for(int k = size - 1; k >=0; k--) {
        		res.add(res.get(k) | 1 << i);
        	}
        }
        return res;
    }
}

/** Amazon
 */