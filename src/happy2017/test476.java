package happy2017;
//476. Number Complement 
public class test476 {
    public int findComplement(int num) {
    	int res = 0;
    	int index = 0;
        while(num != 0){
        	if((num & 1) == 0)
        		res |= (1 << index);
        	num >>= 1;
        	index ++;
        }
        return res;
    }
}
