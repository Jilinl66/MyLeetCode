package happy2017;
//507. Perfect Number
public class test507 {
    public boolean checkPerfectNumber(int num) {
    	int sum = (num == 1? 0: 1);
        for(int i = 2; i < Math.sqrt(num); i++){
        	if(num % i == 0){
        		sum += i;
        		if(i != num/i)
            		sum += num /i;
        	}
        }
        return sum == num? true: false;
    }
}
