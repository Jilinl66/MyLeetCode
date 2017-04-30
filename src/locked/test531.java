package locked;

//531. Lonely Pixel I
public class test531 {
    public int findLonelyPixel(char[][] picture) {
    	int m = picture.length, n = picture[0].length;
    	int res = 0;
        int[] numOfBCol = new int[n];
        boolean[] candidate = new boolean[n];
        for(int i = 0; i < m; i++) {
        	boolean atMostOne = true;
        	int firstB = -1;
        	for(int j = 0; j < n; j++) {
        		if(picture[i][j] == 'B') {
        			numOfBCol[j] ++;
        			if(atMostOne) {
        				candidate[j] = true;
        				atMostOne = false;
        				firstB = j;
        			}
        			else {
        				candidate[firstB] = false;
        			}
        		}
        	}
        }
        for(int i = 0; i < n; i++) {
        	if(numOfBCol[i] <= 1 && candidate[i])
        		res++;
        }
        return res;
    }
}
