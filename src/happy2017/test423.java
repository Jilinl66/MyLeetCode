package happy2017;
//423. Reconstruct Original Digits from English
public class test423 {
    public String originalDigits(String s) {
    	int[] count = new int[10];
    	for(int i = 0; i < s.length(); i++){
    		char c = s.charAt(i);
    		if(c == 'z') count[0]++; //0
    		if(c == 'o') count[1]++; //0,1,2,4
    		if(c == 'w') count[2]++; //2
    		if(c == 'h') count[3]++; //3,8
    		if(c == 'u') count[4]++; //4
    		if(c == 'f') count[5]++; //4,5
    		if(c == 'x') count[6]++; //6
    		if(c == 's') count[7]++; //6,7
    		if(c == 'g') count[8]++; //8
    		if(c == 'i') count[9]++; //5,6,8,9
     	}
    	count[1] -= count[0] + count[2] + count[4];
    	count[3] -= count[8];
    	count[5] -= count[4];
    	count[7] -= count[6];
    	count[9] -= count[5] + count[6] + count[8];
    	StringBuilder sbBuilder = new StringBuilder();
    	for(int i = 0; i < 10; i++)
    		for(int j = 0; j < count[i]; j++)
    			sbBuilder.append(i);
    	return sbBuilder.toString();
    }
}
