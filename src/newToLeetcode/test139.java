package newToLeetcode;
import java.util.Set;

//139. Word Break

public class test139 {
	public boolean wordBreak(String s, Set<String> wordDict) {
		boolean[] flag = new boolean[s.length()+1];
		flag[0] = true;
        for(int i = 1; i<= s.length(); i++){
        	for(int j = i-1; j>=0; j--){
        		if(flag[j] && wordDict.contains(s.substring(j, i))){
        			flag[i] = true;
        			break;
        		}
        	}
        }
        return flag[s.length()];
    }
}
