package happy2017;
//121. Best Time to Buy and Sell Stock
public class test121 {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length;i ++){
        	maxCur = Math.max(0, maxCur + prices[i] - prices[i - 1]);
        	maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
