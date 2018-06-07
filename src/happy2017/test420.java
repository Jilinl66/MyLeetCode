package happy2017;

//420. Strong Password Checker
public class test420 {
    public int strongPasswordChecker(String s) {
    	int res = 0, a = 1, A = 1, d = 1;
    	int len = s.length();
        char[] carr = s.toCharArray();
        int[] arr = new int[len];
        for(int i = 0; i <len; i++) {
        	if(Character.isLowerCase(carr[i])) a = 0;
        	if(Character.isUpperCase(carr[i])) A = 0;
        	if(Character.isDigit(carr[i])) d = 0;
        	int j = i;
        	while(i < len && carr[i] == carr[j])
        		i ++;
        	arr[j] = i - j;
        }
        int total_missing = a + A + d;
        if(arr.length < 6) {
        	res += total_missing + Math.min(0, 6 - (len + total_missing));
        }
        else {
        	int over_len = Math.max(len - 20, 0), left_over = 0;
        	res += over_len;
        	for(int k = 1; k < 3; k++) {
        		for(int i = 0; i < len && over_len > 0; i++) {
        			if(arr[i] < 3 || arr[i] % 3 != (k -1)) continue;
        			arr[i] -= Math.min(over_len, k);
        			over_len -= k;
        		}
        	}
        	for(int i = 0; i < len; i++) {
            	if(arr[i] >= 3 && over_len > 0) {
            		int need = arr[i] - 2;
            		arr[i] -= over_len;
            		over_len -= need;
            	}
            	if(arr[i] >= 3) left_over += arr[i]/3;
            }
        	res += Math.max(total_missing, left_over);
        }
        return res;
    }
}
