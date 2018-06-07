package happy2017;
import java.util.ArrayList;
import java.util.List;

//241. Different Ways to Add Parentheses

public class test241 {
	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> res = new ArrayList<>();
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c == '*' || c == '+' || c == '-') {
				List<Integer> left = diffWaysToCompute(input.substring(0, i));
				List<Integer> right = diffWaysToCompute(input.substring(i + 1, input.length()));
				for(int num1: left) {
					for(int num2: right) {
						switch (c) {
						case '*':
							res.add(num1 * num2);
							break;
						case '+':
							res.add(num1 + num2);
							break;
						case '-':
							res.add(num1 - num2);
							break;
						default:
							break;
						}
					}
				}
			}
		}
		if(res.size() == 0)
			res.add(Integer.parseInt(input));
		return res;
	}
}
