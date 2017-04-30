package happy2017;
//275. H-Index II
public class test275 {
    public int hIndex(int[] citations) {
    	int len = citations.length;
        int low = 0, high = len - 1;
        while(low <= high){
        	int mid = (low + high)/2;
        	if(citations[mid] == len - mid)
        		return len - mid;
        	else if (citations[mid] > len - mid)
        		high = mid - 1;
        	else
        		low = mid + 1;
        }
        return len - low;
    }
}
