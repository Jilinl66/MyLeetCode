package locked;

import java.util.HashMap;

//533. Lonely Pixel II
public class test533 {
	int m, n;
    public int findBlackPixel(char[][] picture, int N) {
    	m = picture.length;
    	n = picture[0].length;
    	HashMap<String, Integer> map = new HashMap<>();
    	int[] colCount = new int[n];
    	for(int i = 0; i < m; i++) {
        	String key = scanRow(picture, colCount, i, N);
        	if(key.length() != 0)
        		map.put(key, map.getOrDefault(key, 0) + 1);
    	}
    	int res = 0;
		for(String key: map.keySet()) {
			if(map.get(key) == N) {
				for(int j = 0; j < n; j++) {
					if(key.charAt(j) == 'B' && colCount[j] == N)
						res += N;
				}
			}
		}
    	return res;
    }
    
    private String scanRow(char[][] picture, int[] colCount, int row, int N) {
		StringBuilder sBuilder = new StringBuilder();
		int rowCount = 0;
		for (int j = 0; j < n; j++) {
			sBuilder.append(picture[row][j]);
			if(picture[row][j] == 'B') {
				rowCount ++;
				colCount[j] ++;
			}
		}
		return rowCount == N? sBuilder.toString(): "";
	}
}
