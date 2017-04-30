package newToLeetcode;
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
		int row = matrix.length;
		int col = matrix[0].length;
		for(int index = 0; index < row*col; index++){
			if(matrix[index/col][index%col] == target)
				return true;
		}
		return false;
	}
}
