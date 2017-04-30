package happy2017;
//27. Remove Element
public class test27 {
    public int removeElement(int[] nums, int val) {
        int p = -1;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] != val)
        		nums[++p] = nums[i];
        }
        return p + 1;
    }

//    public int removeElement(int[] nums, int val) {
//        int p = -1;
//        for(int i = 0; i < nums.length; i++){
//        	if(nums[i] != val){
//        		p ++;
//        		swap(nums, p, i);
//        	}
//        }
//        return p + 1;
//    }
//    
//    private void swap(int[] A, int a, int b) {
//		if(a == b) return;
//		int temp = A[a];
//		A[a] = A[b];
//		A[b] = temp;
//	}
}
