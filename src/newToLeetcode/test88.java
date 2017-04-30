package newToLeetcode;
//88. Merge Sorted Array
public class test88 {

	public static void main(String[] args) {
		test88 t4 = new test88();
		int[] nums1 = {1,3,0,0,0};
		int[] nums2 = {2};
		int m = 2;
		int n = 1;
		t4.merge(nums1, m, nums2, n);
	}

//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i=0, j=0;
//        while(i < m && j < n){
//        	if (nums2[j] < nums1[i]){
//        		for (int k = m - 1; k >= i; k--){
//        			nums1[k+1] = nums1[k];
//        		}
//    			nums1[i] = nums2[j];
//        		j++;
//        		m++;
//        	}
//        	i++;        	
//        }
//        while(j < n){
//        	nums1[i++] = nums2[j++];
//        }
//        for (int a : nums1){
//        	System.out.println(a);
//        }
//    }
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while(i >= 0 && j >= 0){
			if (nums1[i] > nums2[j]){
				nums1[k--] = nums1[i--];
			}
			else{
				nums1[k--] = nums2[j--];
			}
		}
		while (j >= 0){
			nums1[k--] = nums2[j--];
		}
		for (int a : nums1){
        	System.out.println(a);
        }
	}
}
