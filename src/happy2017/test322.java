package happy2017;

//322. Coin Change
public class test322 {
    public int coinChange(int[] coins, int amount) {
    	if(amount < 1) return 0;
    	return helper(coins, amount, new int[amount + 1]);
    }

	private int helper(int[] coins, int remain, int[] count) {
		if(remain < 0) return -1;
		if(remain == 0) return 0;
		if(count[remain] != 0)
			return count[remain];
		int min = Integer.MAX_VALUE;
		for(int coin: coins){
			int ret = helper(coins, remain - coin, count);
			if(ret >= 0 && ret + 1 < min)
				min = ret + 1;
		}
		count[remain] = (min == Integer.MAX_VALUE? -1: min);
		return count[remain];
	}
}
