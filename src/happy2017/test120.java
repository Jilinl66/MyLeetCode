package happy2017;

import java.util.List;

//120. Triangle
public class test120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int[] A = new int[triangle.size() + 1];
		for(int i = triangle.size() - 1; i >= 0; i--){
			for(int j = 0; j < triangle.get(i).size(); j++)
				A[j] = Math.min(A[j], A[j + 1]) + triangle.get(i).get(j);
		}
		return A[0];
	}
	
	//Stack overflow
//    int min = Integer.MAX_VALUE;
//
//    public int minimumTotal(List<List<Integer>> triangle) {
//    	if(triangle == null || triangle.size() == 0) return 0;
//        calmin(triangle, 1, 0, triangle.get(0).get(0));
//        return min;
//    }
//    
//    private void calmin(List<List<Integer>> triangle, int layer, int i, int sum) {
//    	if(layer == triangle.size()){
//    		min = Math.min(min, sum);
//    		return;
//    	}
//    	calmin(triangle, layer + 1, i, triangle.get(layer).get(i) + sum);
//    	calmin(triangle, layer + 1, i + 1, triangle.get(layer).get(i + 1) + sum);
//	}
}
