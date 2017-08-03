package locked;

import java.util.HashMap;
import java.util.Map;

//311. Sparse Matrix Multiplication
public class test311 {
	
	//Use HahsMap
	public int[][] multiply(int[][] A, int[][] B) {
		 int rowA = A.length, colA = A[0].length, colB = B[0].length;
		 int[][] result = new int[rowA][colB];
		 Map<Integer, HashMap<Integer, Integer>> tableB = new HashMap<>();
		 for(int k = 0; k < colA; k++) {
			 tableB.put(k, new HashMap<>());
			 for(int j = 0; j < colB; j++) {
				 if(B[k][j] != 0)
					 tableB.get(k).put(j, B[k][j]);
			 }
		 }
		 for(int i = 0; i < rowA; i++){
			 for(int k = 0; k < colA; k++) {
				 if(A[i][k] != 0) {
					 for(int j: tableB.get(k).keySet()) {
						 result[i][j] += A[i][k] * B[k][j];
					 }
				 }
			 }
		 }
		 return result;
	}
	
//Without map
//    public int[][] multiply(int[][] A, int[][] B) {
//        int rowA = A.length, colA = A[0].length, colB = B[0].length;
//        int[][] result = new int[rowA][colB];
//        for(int i = 0; i < rowA; i ++) {
//        	for(int k = 0; k < colA; k++) {
//        		if(A[i][k] != 0) {
//        			for(int j = 0; j < colB; j++) {
//        				if(B[k][j] != 0)
//        					result[i][j] += A[i][k] * B[k][j];
//        			}
//        		}
//        	}
//        }
//        return result;
//    }
}