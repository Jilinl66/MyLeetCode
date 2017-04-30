package happy2017;
//441. Arranging Coins
public class test441 {
    public int arrangeCoins(int n) {
    	int i = 0;
    	while(n >= 0)
    		n -= ++i;
    	return i - 1;
    }
}
