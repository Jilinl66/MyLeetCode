package happy2017;
//165. Compare Version Numbers
public class test165 {
    public int compareVersion(String version1, String version2) {
    	String[] level1 = version1.split(".");
    	String[] level2 = version2.split(".");
    	int length = Math.max(level1.length, level2.length);
    	for(int i = 0; i < length; i++){
    		int v1 = i < level1.length? Integer.valueOf(level1[i]): 0;
    		int v2 = i < level2.length? Integer.valueOf(level2[i]): 0;
    		System.out.println("v1: " + v1 + " v2: " + v2);
    		if(v1 > v2)
    			return 1;
    		else if(v1 < v2)
    			return -1;
    	}
    	return 0;
    }
}
