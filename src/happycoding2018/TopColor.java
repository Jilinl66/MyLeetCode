package happycoding2018;

// Yelp OA V11
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopColor {
	public String[] findTopColorList(String[][] target) {
		int topCount = 0;
		Map<String, Integer> countMap = new HashMap<>();
		for (String[] strArr: target) {
			for (String str: strArr) {
				countMap.put(str, countMap.getOrDefault(str, 0) + 1);
				topCount = Math.max(countMap.get(str), topCount);
			}
		}
		PriorityQueue<String> queue = new PriorityQueue<>();
		for (String key: countMap.keySet()) {
			int count = countMap.get(key);
			if (count == topCount) {
				queue.offer(key);
			}
		}
		String[] resColors = new String[queue.size()];
		int i = 0;
		while(!queue.isEmpty()) {
			resColors[i++] = queue.poll();
		}
		return resColors;
	}
}
