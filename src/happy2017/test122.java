package happy2017;
//122. Best Time to Buy and Sell Stock II
public class test122 {
    public int maxProfit(int[] prices) {
    	int profit = 0, i = 0;
    	while(i < prices.length){
	    	while(i < prices.length - 1 && prices[i + 1] < prices[i])
	    		i++;
	    	int min = prices[i];
	    	while(i < prices.length - 1 && prices[i + 1] > prices[i])
	    		i++;
	    	profit += (prices[i++] - min);
    	}
    	return profit;
    }
 }
