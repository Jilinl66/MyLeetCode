package locked;

//484. Find Permutation	
public class test484 {
    public int[] findPermutation(String s) {
        int n = s.length();
        int[] arr  = new int[n + 1];
        for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
        for(int j = 0; j < s.length(); j++) {
        	if(s.charAt(j) == 'D') {
        		int i = j;
        		while(j < n && s.charAt(j) == 'D')
        			j++;
        		reverse(arr, i, j);
        	}
        }
        return arr;
    }
    
    private void reverse(int[] arr, int i, int j) {
    	while(i < j) {
    		int temp = arr[i];
    		arr[i] = arr[j];
    		arr[j] = temp;
    		i ++;
    		j --;
    	}
	}
}


//Greedy