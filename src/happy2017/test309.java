package happy2017;
//309. Best Time to Buy and Sell Stock with Cooldown
public class test309 {
	public int maxProfit(int[] prices) {
	    int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
	    for (int price : prices) {
	        prev_buy = buy;
	        buy = Math.max(prev_sell - price, prev_buy);
	        prev_sell = sell;
	        sell = Math.max(prev_buy + price, prev_sell);
	    }
	    return sell;
	}
}
