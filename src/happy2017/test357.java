package happy2017;
//357. Count Numbers with Unique Digits
public class test357 {
	public int countNumbersWithUniqueDigits(int n) {
		if(n > 10) return 0;
		int count = 1;
		int max = (int) Math.pow(10, n);
		boolean[] used = new boolean[10];
		for(int i = 1; i < 10; i++){
			used[i] = true;
			count += search(i, max, used);
			used[i] = false;
		}
		return count;
	}
	
	private int search(long prev, int max, boolean[] used) {
		int count = 0;
		if(prev < max)
			count += 1;
		else
			return count;
		for(int i = 0; i < 10; i++){
			if(!used[i]){
				used[i] = true;
				long cur = 10 * prev + i;
				count += search(cur, max, used);
				used[i] = false;
			}
		}
		return count;
	}
	
//    public int countNumbersWithUniqueDigits(int n) {
//    	if(n == 0) return 1;
//        int sum = 10, base = 9;
//        if(n > 10) return 0;
//        for(int i = 1; i < n; i++){
//        		base *= (10 - i);
//        		sum += base;
//        }        	
//        return sum;
//    }
}
