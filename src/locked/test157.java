package locked;
//157. Read N Characters Given Read4
public class test157 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
    	char[] temp = new char[4];
    	int total = 0;
    	boolean eof = false;
        while(!eof && total < n){
        	int ret = read4(temp);
        	eof = (ret < 4);
        	ret = Math.min(ret, n - total);
        	for(int i = 0; i < ret; i++)
        		buf[total ++] = temp[i];
        }
        return total;
    }

	private int read4(char[] buf) {
		return 0;
	}
}

//facebook
