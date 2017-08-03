package happy2017;
//204. Count Primes
public class test204 {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
        	if(i > 2 && i % 2 == 0) continue;
        	if(!primes[i])
        		count ++;
        	for(int j = 2; i * j < n; j++)
        		primes[i * j] = true;
        }
        return count ++;
    }
}
