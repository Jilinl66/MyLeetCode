package happy2017;
//492. Construct the Rectangle
public class test492 {
    public int[] constructRectangle(int area) {
    	int[] res = new int[2];
        int W = (int) Math.sqrt(area);
        while(area % W != 0)
        	W--;
        res[1] = W;
        res[0] = area/W;
        return res;
    }
}
