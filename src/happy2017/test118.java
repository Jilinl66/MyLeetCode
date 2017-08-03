package happy2017;

import java.util.ArrayList;
import java.util.List;

//118. Pascal's Triangle
public class test118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows == 0)
        	return triangle;
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i = 2; i <= numRows; i++){
        	List<Integer> prelist = triangle.get(i - 2);
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(1);
        	for(int j = 1; j < i - 1; j++)
        		list.add(prelist.get(j) + prelist.get(j - 1));
        	list.add(1);
    		triangle.add(i - 1, list);
        }
        return triangle;
    }
}
