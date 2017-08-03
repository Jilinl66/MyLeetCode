package happy2017;
///345. Reverse Vowels of a String
public class test345 {
    public String reverseVowels(String s) {
    	char[] charArr = s.toCharArray();
        int head = 0, tail = s.length() -1;
    	while(head < tail){
    		if(!isVowel(charArr[head]))
    			head++;
    		else if(!isVowel(charArr[tail])){
    			tail--;
    		}
    		else{
    			char temp = charArr[tail];
    			charArr[tail]= charArr[head];
    			charArr[head] = temp;;
    			head ++;
    			tail--;
    		}
    	}
    	return String.valueOf(charArr);
    }
    
    private boolean isVowel(char ch) {
    	if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||  ch=='i' || ch=='I' || ch=='o' || ch=='O' ||ch=='u' || ch=='U')
    		return true;
    	return false;
	}
}
