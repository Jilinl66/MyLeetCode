package happycoding2018;

import java.util.ArrayList;
import java.util.List;

public class Q22_GenerateParentheses {
	public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, "", n, 0, 0);
        return list;
    }
    
    private void helper(List<String> list, String s, int n, int left, int right) {
        if (s.length() == 2 * n) {
            list.add(s);
            return;
        }
        if (left < n) {
            helper(list, s + "(", n, left + 1, right);
        }
        if (left > right) {
            helper(list, s + ")", n, left, right + 1);
        }
    }
}
