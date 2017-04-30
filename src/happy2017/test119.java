package happy2017;

import java.util.ArrayList;
import java.util.List;

//119. Pascal's Triangle II
public class test119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[rowIndex + 1];
        for(int i = 0; i < rowIndex; i++){
        	arr[0] = 1;
        	arr[i] = 1;
        	for(int j = i - 1; j > 0; j--)
        		arr[j] = arr[j - 1] + arr[j];
        }
        for(int i = 0; i < rowIndex + 1; i++)
        	list.add(arr[i]);
        return list;
    }
}
