package newToLeetcode;
//287. Find the Duplicate Number

public class test287 {
	 public int findDuplicate(int[] nums) {
		 int count;
		 int low = 0;
		 int high = nums.length - 1;
		 while(low < high){
			 count = 0;
			 int mid = (low + high)/2;
			 for(int i: nums){
				 if(i <= mid)
					 count++;
			 }
			 if(count <= mid)
				 low = mid + 1;
			 else
				 high = mid;
		 }
		 return low;
	 }
}