package happy2017;
//402. Remove K Digits
public class test402 {
    public String removeKdigits(String num, int k) {
    	int resLen = num.length() - k;
    	char[] str = num.toCharArray();
    	char[] stack = new char[num.length()];
    	int top = 0;
    	for(int i = 0; i < num.length(); i++){
    		while(top > 0 && stack[top - 1] > str[i] && k > 0){
    			top --;
    			k --;
    		}
    		stack[top ++] = str[i];
    	}
    	int index = 0;
    	while(index < resLen && stack[index] == '0') index++;
    	System.out.println(stack.toString());
    	return index >= resLen? "0": String.valueOf(stack).substring(index, resLen);
    }   
}	
