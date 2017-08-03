package happy2017;
//70. Climbing Stairs
public class test70 {
    public int climbStairs(int n) {
        if(n <= 0) return 0;
        int a = 1, b = 2;
        for(int i = 1; i < n; i++){
        	b = a + b;
        	a = b - a;
        }
        return a;
    }
}
