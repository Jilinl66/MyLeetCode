package happy2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//406. Queue Reconstruction by Height
public class test406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
        	public int compare(int[] o1, int[] o2) {
				return o1[0] == o2[0]? o1[1] - o2[1]: o2[0] - o1[0];
			}
		});
        List<int[]> res = new ArrayList<int[]>();
        for(int[] person: people){
        	res.add(person[1], person);
        }
        return res.toArray(new int[people.length][2]);
    }
}
