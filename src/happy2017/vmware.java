package happy2017;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class vmware {

//	static long countSum(int[] numbers) {
//		long sum = 0;
//		for(int i = 0; i < numbers.length; i++){
//			long subsum = 0;
//			for(int j = 1; j <= numbers[i]; j++){
//				if(j % 2 == 1 && numbers[i] % j == 0)
//					subsum = subsum + j;
//				System.out.println(subsum);
//			}
//			sum = sum + subsum;
//		}
//		return sum;
//    }

//	static int playlist(String[] songs, int k, String q) {
//		int len = songs.length;
//		int index1 = (k + 1) % len;
//		int index2 = ((k == 0)? len - 1: k - 1);
//		int count1 = 1;
//		int count2 = 1;
//		while(!q.equals(songs[index1])){
//			index1 = (index1 + 1) % len;
//			count1 ++;
//		}
//		while(!q.equals(songs[index2])){
//			index2 = ((index2 == 0) ? len - 1: index2 - 1);
//			count2 ++;
//		}
//		return (count1 < count2) ? count1 : count2;
//	}
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        long res;
        
        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }
        
        int _m;
        _m = Integer.parseInt(in.nextLine().trim());
        
        res = beautifulSubarrays(_a, _m);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
	
	static long beautifulSubarrays(int[] a, int m) {
		long count = 0;
		for(int i = 0; i < a.length; i++)
			helper(a, m, count, 0);
		return count;
    }
	
	private static void helper(int[] array, int m, long count, int start){
		if(m == 0)
			count ++;
		if(m < 0)
			return;
		for(int i = start; i < array.length; i++){
			if(array[i] % 2 == 0)
				helper(array, m, count, start + 1);
			else
				helper(array, m - 1, count, start + 1);
		}
	}
}
