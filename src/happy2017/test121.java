package happy2017;
//121. Best Time to Buy and Sell Stock
public class test121 {
    public int maxProfit(int[] prices) {
    		int min = Integer.MAX_VALUE, maxProfit = 0;
    		for (int i = 0; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			if(prices[i] > min) {
				maxProfit = Math.max(maxProfit, prices[i] - min);
			}
		}
    		return maxProfit;
    }
}
