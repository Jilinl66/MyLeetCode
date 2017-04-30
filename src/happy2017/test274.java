package happy2017;

import java.util.Arrays;

//274. H-Index
public class test274 {
	public static void main(String[] args) {
		int[] a = {1,2,100};
		System.out.println(hIndex(a));	
}
    public static int hIndex(int[] citations) {
    	Arrays.sort(citations);
    	if(citations.length == 0 || citations[citations.length - 1] == 0)
        	return 0;
    	if(citations[0] > citations.length)
    		return citations.length;
    	int count = 0;
    	for(int i = citations.length - 1; i >= 0; i--){
			count ++;
    		if(citations[i] == count)
    			return count;
    		if(citations[i] < count){
    			return count - 1;
    		}
    	}
		return 0;
    }
}
