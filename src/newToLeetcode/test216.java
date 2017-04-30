package newToLeetcode;
import java.util.ArrayList;
import java.util.List;

//216. Combination Sum III

public class test216 {

	public static void main(String[] args) {
		test216 t5 = new test216();
		t5.combinationSum3(2, 4);
	}
	
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (k == 0 || k > 9 || n < 1 || n > 45){
            return null;
        }
        List<Integer> resArray = new ArrayList<Integer>();
        getCombination(a, k, 0, resArray, 0, n, resList);
        return resList;
    }
     
    private void getCombination(int[] a, int k, int i_a, List<Integer> resArray, int i_res, int n, List<List<Integer>> resList){
        if(k == 0){
        	for (int j = 0; j < resArray.size(); j ++){
                System.out.print(resArray.get(j) + " ");
            }
            System.out.println();
            if (resArray.stream().mapToInt(Integer::intValue).sum() == n){ 
                resList.add(resArray);
            }
            return;
        }
        for (int i = i_a; i < a.length; i++){
            resArray.add(a[i]);
            getCombination(a, k - 1, i + 1, resArray, i_res + 1, n, resList);
        }
    }   
}
