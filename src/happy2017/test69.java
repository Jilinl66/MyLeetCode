package happy2017;
//69. Sqrt(x)
public class test69 {
    public int mySqrt(int x) {
        long r = x;
        while(r * r > x){
        	r = (r + x /r)/2;
        }
        return (int) r;
    }
}
