package happy2017;
//556. Next Greater Element III
public class test556 {
    public int nextGreaterElement(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int i = chars.length - 2;
        while(i >= 0 && chars[i] >= chars[i + 1])
        	i--;
        if(i < 0) return -1;
        int j = i + 2;
        while(j < chars.length && chars[j] > chars[i])
        	j++;
        switchChar(chars, i, j);
        i++;
        j = chars.length - 1;
//        System.out.println(chars);
        while(i < j){
        	switchChar(chars, i, j);
        	i++;
        	j--;
        }
        long res = Long.parseLong(String.valueOf(chars));
        return res <= Integer.MAX_VALUE? (int)res: -1;
    }
    
    private void switchChar(char[] chars, int i, int j) {
    	char tempc = chars[i];
        chars[i] = chars[j];
        chars[j] = tempc;
	}
}
