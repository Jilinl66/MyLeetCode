package happy2017;
//393. UTF-8 Validation
public class test393 {
    public boolean validUtf8(int[] data) {
    	int i = 0;
        while(i < data.length){
        	if(data[i] >> 7== 0){
        		i ++;
        		continue;
        	}
        	else if(data[i] >> 5 == 0b110){
        		if(i + 1 >= data.length || data[i + 1] >> 6 != 0b10)
        			return false;
    			i += 2;
        	}
        	else if(data[i] >> 4 == 0b1110){
        		if(i + 2 >= data.length || data[i + 1] >> 6 != 0b10 || data[i + 2] >> 6 != 0b10)
        			return false;
        		i += 3;
        	}
        	else if(data[i] >> 3 == 0b11110){
        		if(i + 3 >= data.length || data[i + 1] >> 6 != 0b10 || data[i + 2] >> 6 != 0b10 || data[i + 3] >> 6 != 0b10)
        			return false;
        		i += 4;
        	}
        	else
				return false;
        }
        return true;
    }
}
