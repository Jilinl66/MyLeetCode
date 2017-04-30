package happy2017;
//190. Reverse Bits
public class test190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        while(s.length() < 32)
        	s = "0" + s;
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--){
        	res = res * 2 + Integer.valueOf(s.substring(i, i + 1));
        }
        return res;
    }
}
