package happy2017;
//338. Counting Bits
public class test338 {
    public int[] countBits(int num) {
    	int offset = 1;
    	int[] res = new int[num + 1];
    	for (int i = 1; i <= num; i++) {
			if(i == offset << 1)
				offset <<= 1;
			res[i] = res[i - offset] + 1;
		}
    	return res;
    }
}
