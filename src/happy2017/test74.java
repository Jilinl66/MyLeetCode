package happy2017;
//Search a 2D Matrix

/*Method1:*/
//public class test74 {
//	public boolean searchMatrix(int[][] matrix, int target) {
//		if(matrix.length == 0)
//			return false;
//		int i = 0, targetRow;
//		while(i < matrix.length && matrix[i][0] <= target)
//			i++;
//		 if(i == 0)
//			 targetRow = i;
//		 else targetRow = i -1;
//		 for(int j = 0; j < matrix[0].length; j++){
//			 if(matrix[targetRow][j] == target)
//				 return true;
//		 }
//		 return false;
//	}
//}

/*Method2:*/
public class test74 {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0) return false;
		int m = matrix.length, n = matrix[0].length;
		int lo = 0, hi = m * n - 1;
		while(lo <= hi) {
			int mi = (lo + hi)/2;
			int i = mi/n, j = mi%n;
			if(matrix[i][j] == target) return true;
			else if(matrix[i][j] < target) lo = mi + 1;
			else hi = mi - 1;
		}
		return false;
	}
}
