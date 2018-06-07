package happy2017;

import java.util.ArrayList;
import java.util.List;

//22. Generate Parentheses
public class test22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, "", n, 0, 0);
        return res;
    }
    
    private void helper(List<String> res, String str, int n, int left, int right) {
		if(left == n && right == n) {
			res.add(str);
			return;
		}
		if(left <= n) {
			str += "(";
			helper(res, str, n, left + 1, right);
			str = str.substring(0, str.length() - 1);
		}
		if(left > right) {
			str += ")";
			helper(res, str, n, left, right + 1);
			str = str.substring(0, str.length() - 1);
		}
	}
}

/** Google Uber Zenefits
 * 
 */
