package locked;
 
//302. Smallest Rectangle Enclosing Black Pixels
public class test302 {
    public int minArea(char[][] image, int x, int y) {
        int m = image.length, n = image[0].length;
        int left = searchCols(image, 0, y, 0, m, true);
        int right = searchCols(image, y + 1, n, 0, m, false);
        int top = searchRows(image, 0, x, left, right, true);
        int botton = searchRows(image, x + 1, m, left, right, false);
        return (right - left) * (botton - top);
    }
    
    private int searchCols(char[][] image, int i, int j, int top, int botton, boolean opt) {
		while(i < j) {
			int tempTop = top;
			int mid = (i + j)/2;
			while(tempTop < botton && image[tempTop][mid] == '0')
				tempTop ++;
			if(tempTop < botton == opt)
				j = mid;
			else
				i = mid + 1;
		}
		return i;
	}
    
    private int searchRows(char[][] image, int i, int j, int left, int right, boolean opt) {
		while(i < j) {
			int tempLeft = left;
			int mid = (i + j)/2;
			while(tempLeft < right && image[mid][tempLeft] == '0')
				tempLeft++;
			if(tempLeft < right == opt)
				j = mid;
			else
				i = mid + 1;
		}
		return i;
	}
}

//Binary search
