package happy2017;

//365. Water and Jug Problem
public class test365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x + y < z) return false;
        if(x == z || y == z || x + y == z) return true;
        return z % greatedCommonDivider(x, y) == 0;
    }
       
    private int greatedCommonDivider(int a, int b) {
		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
